package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
	
	

	List<Course> getCourses();

	Course getCourse(long courseId);

	Course addCourse(Course course);

	Course updateCourse(Course course);

	void deleteCourse(long parseLong);

}
