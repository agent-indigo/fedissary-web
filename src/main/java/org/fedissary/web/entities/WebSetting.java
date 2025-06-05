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
public final class WebSetting {
  @Id
  private final UUID id = UUID.randomUUID();
  private User user_id;
  @Lob
  @Nullable
  private String data;
  @CreatedDate
  private final LocalDateTime created_at;
  @LastModifiedDate
  private LocalDateTime updated_at;
}