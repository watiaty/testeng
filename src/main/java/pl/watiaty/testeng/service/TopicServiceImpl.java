package pl.watiaty.testeng.service;

import org.springframework.stereotype.Service;
import pl.watiaty.testeng.entity.Topic;
import pl.watiaty.testeng.repository.TopicRepository;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public List<Topic> findByLevel(Long id) {
        return topicRepository.findByLevel(id);
    }
}
