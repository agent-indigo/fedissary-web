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
import lombok.Data;
@Data
@Entity
public final class Report {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  private Account target_account_id;
  @Nullable
  private Account action_taken_by_account_id;
  @Nullable
  private Account assigned_account_id;
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