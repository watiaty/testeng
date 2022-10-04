package pl.watiaty.testeng.service;

import org.springframework.stereotype.Service;
import pl.watiaty.testeng.entity.Answer;
import pl.watiaty.testeng.repository.AnswerRepository;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> findByTestsId(Iterable<Long> ids) {
        return answerRepository.findAnswersByTestIds(ids);
    }
}
