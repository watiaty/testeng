package pl.watiaty.testeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.watiaty.testeng.entity.Topic;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    List<Topic> findAll();

    List<Topic> findByLevel(Long id);
}
