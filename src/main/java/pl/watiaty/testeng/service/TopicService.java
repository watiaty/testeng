package pl.watiaty.testeng.service;

import pl.watiaty.testeng.entity.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> findAll();

    List<Topic> findByLevel(Long id);
}
