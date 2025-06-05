package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public final class AccountConversation {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  private Conversation conversation_id;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<UUID> participant_account_ids;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<UUID> status_ids;
  private Float lock_version;
  private Boolean unread;
  @Nullable
  private UUID last_status_id;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}