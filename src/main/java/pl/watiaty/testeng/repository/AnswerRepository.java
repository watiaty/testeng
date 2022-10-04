package pl.watiaty.testeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.watiaty.testeng.entity.Answer;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Query(value = "select * from answers where answers.id_test in :ids", nativeQuery = true)
    List<Answer> findAnswersByTestIds(@Param("ids") Iterable<Long> ids);
}
