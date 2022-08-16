package com.example.universities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universities.entity.University;
import com.example.universities.repository.UniversityRepository;



@Service
public class UniversityService {
	@Autowired
	private UniversityRepository repository;
	
	public University saveUniversity(University university)
	{
		return repository.save(university);
	}
	
	public List<University> saveUniversities(List<University> universities)
	{
		return repository.saveAll(universities);
	
	}
	
	public List<University> getUniversity()
	{
		return repository.findAll();
	}
	
	public University getUniversityById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public University getUniversityByName(String name)
	{
		return repository.findByName(name);
	}
	
}