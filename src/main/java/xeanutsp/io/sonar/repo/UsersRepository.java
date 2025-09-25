package xeanutsp.io.sonar.repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import xeanutsp.io.sonar.entity.User;

public interface UsersRepository extends JpaRepository<User, Long> {

    @Query("SELECT * FROM User u")
    List<User> findAll();

    @Query(value = "SELECCT * FROM User u WHERE id = ?1")
    List<User> find(Long id);

    @Query(value = "INSERT INTO User u(id, name, username,email, phone, webiste) VALUES ?1")
    User saveUser(User userAdd);

    @Query(value = "UPDATE TABLE User u WHERE u = ?1")
    User updateUser(Long id, User userUpdate);

    @Query(value = "DELETE FROM User u WHERE u.id = ?1")
    void deleteById(Long id);
}
