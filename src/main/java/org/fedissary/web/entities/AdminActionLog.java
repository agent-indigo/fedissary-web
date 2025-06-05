package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(
  indexes = {
    @Index(
      columnList = "target_type, target_id"
    )
  }
)
public final class AdminActionLog {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private Account account_id;
  @Lob
  @Nullable
  private String target_type;
  @Lob
  @Nullable
  private String target_id;
  @Lob
  private String action;
  @Lob
  private String recorded_changes;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}