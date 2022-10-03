package pl.watiaty.testeng.service;

import org.springframework.stereotype.Service;
import pl.watiaty.testeng.entity.Subtopic;
import pl.watiaty.testeng.repository.SubTopicRepository;

import java.util.List;

@Service
public class SubTopicServiceImpl implements SubTopicService {
    private final SubTopicRepository subTopicRepository;

    public SubTopicServiceImpl(SubTopicRepository subTopicRepository) {
        this.subTopicRepository = subTopicRepository;
    }

    @Override
    public List<Subtopic> findAll() {
        return subTopicRepository.findAll();
    }

    @Override
    public Subtopic findById(Long id) {
        return subTopicRepository.findById(id).get();
    }

    @Override
    public List<Subtopic> findByTopic(Long id) {
        return subTopicRepository.findAllByTopicId(id);
    }
}
