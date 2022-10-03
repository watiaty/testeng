package pl.watiaty.testeng.service;

import pl.watiaty.testeng.entity.Subtopic;

import java.util.List;

public interface SubTopicService {
    List<Subtopic> findAll();
    List<Subtopic> findByTopic(Long id);

    Subtopic findById(Long id);
}
