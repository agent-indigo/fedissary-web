package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.PreviewCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PreviewCardRepository extends JpaRepository<PreviewCard, UUID> {}