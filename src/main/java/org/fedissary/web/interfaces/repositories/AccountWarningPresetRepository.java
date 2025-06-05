package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.AccountWarningPreset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountWarningPresetRepository extends JpaRepository<AccountWarningPreset, UUID> {}