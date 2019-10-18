package io.javabrains.springbootstarter.hello;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@Autowired
	private TopicService topicService;
	@RequestMapping("/hello")
	
	
	public List<Topic> sayHai() {

		return topicService.getAll();
	}
	@RequestMapping("/hello/{id}")
	public Topic id(@PathVariable String id) {
		return topicService.findId(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/hello")
	public List<Topic> addTopic(@RequestBody Topic t) {
		return topicService.addTopic(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/hello/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic t) {
		topicService.updateValue(id,t);
		
	}
	

}
