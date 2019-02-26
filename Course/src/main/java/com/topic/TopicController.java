package com.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {

		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getAllTopics(@PathVariable String id) {
		
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void setAllTopics(@RequestBody Topic topic) {
		
		topicservice.setTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public void updateTopics(@RequestBody Topic topic, @PathVariable String id) {
		
		topicservice.updateTopic(topic, id);
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public void deleteTopics(@RequestBody Topic topic, @PathVariable String id) {
		
		topicservice.deleteTopic(topic, id);
	}

}