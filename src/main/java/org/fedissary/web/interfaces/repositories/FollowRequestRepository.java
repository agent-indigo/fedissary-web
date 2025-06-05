package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.FollowRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FollowRequestRepository extends JpaRepository<FollowRequest, UUID> {}