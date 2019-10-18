package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.hello.Topic;

@Service
public class CourseService {
//	private List<Topic> topic = new ArrayList<>( Arrays.asList(
//	new Topic("1","santhosh","22"),
//	new Topic("2","her","12"),
//	new Topic("3","sfdvdf","23"),
//	new Topic("4","sfdvdfbgfnfgng","23")
//	
//	));
	@Autowired
	private CourseRepo courseRepo;
	public List<Course> getAllCourse(String id) {
		List<Course> topicc = new ArrayList<>();
		//courseRepo.findByTopicId(id).forEach(topicc::add);
		return topicc;
	}
	public Course findIdCourse(String id) {
	//return topic.stream().filter(d->d.getId().equals(id)).findFirst().get();
		Course t = courseRepo.findById(id).get();
		return t;
	}
	public void addCourse(Course t) {
		// TODO Auto-generated method stub
		
		
		courseRepo.save(t);
	}
	public void delCourse(String id) {
		courseRepo.deleteById(id);
	}
//	public void updateValue(String id, Topic topicData) {
//		for (int i=0;i<topic.size();i++) {
//			Topic t = topic.get(i);
//			if(t.getId().equals(id)) {
//				topic.set(i, topicData);
//				return;
//			}
//		}
//	}
}
