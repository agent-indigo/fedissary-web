package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.CustomEmojiCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomEmojiCategoryRepository extends JpaRepository<CustomEmojiCategory, UUID> {}