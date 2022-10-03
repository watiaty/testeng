package pl.watiaty.testeng.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.watiaty.testeng.entity.Test;
import pl.watiaty.testeng.repository.SubTopicRepository;
import pl.watiaty.testeng.repository.TestRepository;

import java.util.List;

import static pl.watiaty.testeng.constants.Constants.ENTITY_ON_PAGE;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    private final SubTopicRepository subTopicRepository;

    public TestServiceImpl(TestRepository testRepository, SubTopicRepository subTopicRepository) {
        this.testRepository = testRepository;
        this.subTopicRepository = subTopicRepository;
    }


    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @Override
    public List<Test> findBySubtopicId(Long subtopic) {
        return testRepository.findAllBySubtopic(subTopicRepository.findById(subtopic).get());
    }

    @Override
    public boolean save(Test test) {
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    public static Pageable constructPageable(Integer pageNumber) {
        return PageRequest.of(pageNumber, ENTITY_ON_PAGE);
    }
}
