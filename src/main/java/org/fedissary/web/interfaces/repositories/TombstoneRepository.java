package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.Tombstone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TombstoneRepository extends JpaRepository<Tombstone, UUID> {}