package proje.v1.api.domian.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    Optional<Users> findByEmail(String email);
    Optional<Users> findByUsernameAndPassword(String username, String password);
}
