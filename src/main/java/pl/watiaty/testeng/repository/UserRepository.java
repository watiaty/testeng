package pl.watiaty.testeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.watiaty.testeng.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
