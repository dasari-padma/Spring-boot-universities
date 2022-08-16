package com.example.universities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.universities.entity.University;

public interface UniversityRepository extends JpaRepository<University,Integer>
{

	University findByName(String name);
	
}
