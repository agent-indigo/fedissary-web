package org.fedissary.web.entities;
import java.time.LocalDateTime;
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
public final class Tag {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Nullable
  private String name;
  @Nullable
  private Boolean usable = true;
  @Nullable
  private Boolean trandable = true;
  @Nullable
  private Boolean listable = true;
  @Nullable
  private LocalDateTime reviewed_at;
  @Nullable
  private LocalDateTime last_status_at;
  @Nullable
  private Float max_score;
  @Nullable
  private LocalDateTime max_score_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}