package org.fedissary.web.entities;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public final class Report {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private Account account_id;
  @ManyToOne
  private Account target_account_id;
  @Nullable
  @ManyToOne
  private Account action_taken_by_account_id;
  @Nullable
  @ManyToOne
  private Account assigned_account_id;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<UUID> status_ids;
  @Lob
  private String comment;
  private Boolean action_taken = false;
  @Nullable
  private URI uri;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}