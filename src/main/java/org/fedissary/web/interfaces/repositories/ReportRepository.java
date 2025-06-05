package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReportRepository extends JpaRepository<Report, UUID> {}