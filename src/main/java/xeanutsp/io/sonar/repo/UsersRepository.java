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

    @Query()
    User saveUser(User userAdd);
    User updateUser(Long id, User userUpdate);
    void deleteById(Long id);
}
