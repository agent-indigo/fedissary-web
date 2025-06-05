package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.StatusStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StatusStatsRepository extends JpaRepository<StatusStats, UUID> {}