package io.javabrains.springbootstarter.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
//	private List<Topic> topic = new ArrayList<>( Arrays.asList(
//	new Topic("1","santhosh","22"),
//	new Topic("2","her","12"),
//	new Topic("3","sfdvdf","23"),
//	new Topic("4","sfdvdfbgfnfgng","23")
//	
//	));
	@Autowired
	private TopicRepo topicRepo;
	public List<Topic> getAll() {
		List<Topic> topicc = new ArrayList<>();
		topicRepo.findAll().forEach(topicc::add);
		return topicc;
	}
	public Topic findId(String id) {
	//return topic.stream().filter(d->d.getId().equals(id)).findFirst().get();
		Topic t = topicRepo.findById(id).get();
		return t;
	}
	public void addTopic(Topic t) {
		// TODO Auto-generated method stub
		
		
		topicRepo.save(t);
	}
	public void del(String id) {
		topicRepo.deleteById(id);
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
