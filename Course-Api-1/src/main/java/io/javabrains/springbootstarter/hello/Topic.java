package io.javabrains.springbootstarter.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String age;
	public String getId() {
		return id;
	}
	public Topic() {
		
	}
	public Topic(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	

}
