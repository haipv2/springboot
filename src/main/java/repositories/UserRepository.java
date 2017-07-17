package repositories;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Namlong on 7/17/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);
}
