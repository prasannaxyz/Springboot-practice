package com.springboot.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.learn.interceptor.CourseServiceInterceptor;

@Component
public class CourseServiceInterceptorAppConfig implements WebMvcConfigurer {
	
	@Autowired
	CourseServiceInterceptor courseServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(courseServiceInterceptor);
	}

}
