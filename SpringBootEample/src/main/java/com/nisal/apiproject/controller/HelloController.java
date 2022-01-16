package com.nisal.apiproject.controller;

import com.nisal.apiproject.model.TopicModel;
import com.nisal.apiproject.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

     @Autowired
    private TopicService topicService;

    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello world";
    }

    @RequestMapping("/topic")
    public List<TopicModel> getTopics()
    {
        return topicService.getTopicModelList();
    }

    @RequestMapping("/topic/{name}")
    public TopicModel getTopicModel(@PathVariable String name)
    {
       return topicService.getTopic(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topic")
    public void addTopic(@RequestBody TopicModel topicModel)
    {
        topicService.addTopic(topicModel);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{id}")
    public void uodateTopic(@RequestBody TopicModel topicModel,@PathVariable String id)
    {
        topicService.updateTopic(id,topicModel);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public void deleteTopic(@RequestBody TopicModel topicModel,@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }
}
