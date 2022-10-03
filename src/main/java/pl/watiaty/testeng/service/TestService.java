package pl.watiaty.testeng.service;

import org.springframework.data.domain.Page;
import pl.watiaty.testeng.entity.Test;

import java.util.List;

public interface TestService {
    List<Test> findAll();

    List<Test> findBySubtopicId(Long subtopic);

    boolean save(Test test);

    boolean deleteById(Integer id);
}
