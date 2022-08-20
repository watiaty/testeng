package pl.watiaty.testeng.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.watiaty.testeng.entity.Subtopic;
import pl.watiaty.testeng.entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
    Page<Test> findAll(Pageable pageable);
    Page<Test> findAllBySubtopic(Pageable pageable, Subtopic subtopic);
}
