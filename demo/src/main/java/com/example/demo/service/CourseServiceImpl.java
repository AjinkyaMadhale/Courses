package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CourseDao;
import com.example.demo.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao coursedao;
	
//	List<Course> list;
	
	
	

	public CourseServiceImpl() {
//		list  = new ArrayList<>();
//		list.add(new Course(145, "Java Core","Basics of java"));
//		list.add(new Course(4343, "spring boot","using rest api"));
	}




	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return coursedao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return coursedao.getOne(courseId);
	}




	@Override
	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
//		list.add(course);
//		return course;
		coursedao.save(course);
		return course;
	}




	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				
//				e.setId(course.getId());
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			
//			}
//		});
//		return course;
		coursedao.save(course);
		return course;
	}




	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

}
