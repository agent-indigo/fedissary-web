package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public final class AccountConversation {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private Account account_id;
  @ManyToOne
  private Conversation conversation_id;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> participant_account_ids;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> status_ids;
  private Float lock_version;
  private Boolean unread;
  @Nullable
  private String last_status_id;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}