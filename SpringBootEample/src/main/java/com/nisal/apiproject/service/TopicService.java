package com.nisal.apiproject.service;

import com.nisal.apiproject.model.TopicModel;
import com.nisal.apiproject.repositories.TopicRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepositories topicRepositories;

  public List<TopicModel> getTopicModelList()
  {
      List<TopicModel> topicModel = new ArrayList<>();
      topicRepositories.findAll().forEach(topicModel::add);
      return topicModel;
  }

  public TopicModel getTopic(String id)
  {
      return topicRepositories.findOne(id);
  }

    public void addTopic(TopicModel topicModel) {
      topicRepositories.save(topicModel);
    }

    public void updateTopic(String id,TopicModel topicModel) {
      topicRepositories.save(topicModel);
    }

    public void deleteTopic(String id)
    {
        topicRepositories.delete(id);
    }
}
