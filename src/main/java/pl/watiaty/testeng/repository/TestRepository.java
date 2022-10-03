package pl.watiaty.testeng.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.watiaty.testeng.entity.Subtopic;
import pl.watiaty.testeng.entity.Test;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
    Page<Test> findAll(Pageable pageable);
    List<Test> findAllBySubtopic(Subtopic subtopic);
}
