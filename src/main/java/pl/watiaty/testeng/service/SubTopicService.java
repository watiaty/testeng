package pl.watiaty.testeng.service;

import pl.watiaty.testeng.entity.Subtopic;

import java.util.List;

public interface SubTopicService {
    List<Subtopic> findByTopic(Long id);
}
