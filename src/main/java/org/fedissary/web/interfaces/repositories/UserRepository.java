package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
  UserDetails findByUsername(String username);
}