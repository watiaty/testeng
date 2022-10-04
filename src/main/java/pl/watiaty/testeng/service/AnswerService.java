package pl.watiaty.testeng.service;

import pl.watiaty.testeng.entity.Answer;

import java.util.Iterator;
import java.util.List;

public interface AnswerService {
    List<Answer> findByTestsId(Iterable<Long> ids);
}
