package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.hello.Topic;

@RestController
//@EnableAutoConfiguration
public class CourseControler {
	@Autowired
	private CourseService courseService;
	@RequestMapping("/hello/{topicId}/course")
	
		public List<Course> sayHaiCourse(@PathVariable String topicId) {
		System.out.print("dvjdkjvfbfb df"+topicId);
		return courseService.getAllCourse(topicId);
	}
	@RequestMapping("/hello/{topicId}/course/{id}")
	public Course idCourse(@PathVariable String id) {
		return courseService.findIdCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/hello/{topicId}/course")
	public void addCourse(@RequestBody Course t, @PathVariable String topicId	) {
		t.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/hello/{topicId}/course/{id}")
	public void updateCourse(@PathVariable String topicId, @RequestBody Course t) {
		t.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(t);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/hello/{topicId}/course/{id}")
	public void delCourse(@PathVariable String id) {
		courseService.delCourse(id);
	}

}
