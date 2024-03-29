package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.hello.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String age;
	@ManyToOne
	private Topic topicData;
	public String getId() {
		return id;
	}
	public Course() {
		
	}
	public Course(String id, String name, String age, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.topicData=new Topic(topicId,"","");
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Topic getTopic() {
		return topicData;
	}
	public void setTopic(Topic topic) {
		this.topicData = topic;
	}
	

}
