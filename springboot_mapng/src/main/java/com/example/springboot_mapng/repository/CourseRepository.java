package com.example.springboot_mapng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.springboot_mapng.dto.CourseDto;
@Component
public interface CourseRepository extends JpaRepository<CourseDto, String>{

}
