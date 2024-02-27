package com.example.springboot_mapng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.springboot_mapng.dto.StudentDto;

@Component
public interface StudentRepository extends JpaRepository<StudentDto, Integer>{

}
