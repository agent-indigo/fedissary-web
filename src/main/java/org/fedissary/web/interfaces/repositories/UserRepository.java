package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
  UserDetails findByUsername(String username);
}