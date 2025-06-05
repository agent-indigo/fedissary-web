package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.WebSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WebSettingRepository extends JpaRepository<WebSetting, UUID> {}