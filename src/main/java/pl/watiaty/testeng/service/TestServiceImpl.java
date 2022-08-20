package pl.watiaty.testeng.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.watiaty.testeng.entity.Test;
import pl.watiaty.testeng.repository.TestRepository;

import java.util.List;

import static pl.watiaty.testeng.constants.Constants.ENTITY_ON_PAGE;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @Override
    public Page<Test> findBySubtopic(Integer page, String subtopic) {
        return null;
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
