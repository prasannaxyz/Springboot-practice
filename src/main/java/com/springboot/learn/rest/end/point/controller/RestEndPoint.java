package com.springboot.learn.rest.end.point.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.rest.end.point.exception.RecordNotFoundException;
import com.springboot.learn.rest.end.point.vo.Course;

@RestController
public class RestEndPoint {

	@RequestMapping("/course/{chapter}")
	public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
			@PathVariable(value = "chapter") Integer chapter) {
		throw new RecordNotFoundException("Chapter doesn't exist.");
		//return new Course(name, chapter);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public String saveCourse(@RequestBody Course course) {
		return "Course name " + course.getName() + " with " + course.getChapterCount() + " saved successfully.";
	}

}
