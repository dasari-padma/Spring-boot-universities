package com.example.universities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.universities.entity.University;
import com.example.universities.service.UniversityService;


@RestController
public class UniversityController 
{
	@Autowired
	private UniversityService service;
	
	@PostMapping("/addUniversity")
	public University addUniversity(@RequestBody University university)
	{
		return service.saveUniversity(university);
	}
	
	@PostMapping("/addUniversity")
	public List<University> addUniversities(@RequestBody List<University> universities)
	{
		return service.saveUniversities(universities);
	
	}
	
	@GetMapping("/university")
	public List<University> findAllUniversity()
	{
		return service.getUniversity();
	}
	
	@GetMapping("/University{id}")
	public University findUniversityById(@PathVariable int id)
	{
		return service.getUniversityById(id);
	}
	
	
}