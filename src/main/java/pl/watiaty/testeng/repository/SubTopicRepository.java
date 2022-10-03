package pl.watiaty.testeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.watiaty.testeng.entity.Subtopic;

import java.util.List;
import java.util.Optional;

public interface SubTopicRepository extends JpaRepository<Subtopic, Long> {
    List<Subtopic> findAllByTopicId(Long id);

    Optional<Subtopic> findById(Long id);
}
