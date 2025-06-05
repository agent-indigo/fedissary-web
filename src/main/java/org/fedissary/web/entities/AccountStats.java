package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public final class AccountStats {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  private Integer statuses_count = 0;
  private Integer following_count = 0;
  private Integer followers_count = 0;
  private Float lock_version;
  @Nullable
  private LocalDateTime last_status_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}