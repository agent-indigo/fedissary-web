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
public final class Announcement {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  private String text;
  private Boolean published = true;
  private Boolean all_day = false;
  @Nullable
  private LocalDateTime scheduled_at;
  @Nullable
  private LocalDateTime starts_at;
  @Nullable
  private LocalDateTime ends_at;
  @Nullable
  private LocalDateTime published_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}