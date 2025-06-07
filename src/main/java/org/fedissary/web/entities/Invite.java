package org.fedissary.web.entities;
import java.time.LocalDateTime;
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
public final class Invite {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private User user_id;
  @Lob
  @Nullable
  private String code;
  private Integer uses = 1;
  private Boolean auto_follow = true;
  @Nullable
  private LocalDateTime expires_at;
  @Nullable
  private Integer max_uses = 1;
  @Lob
  @Nullable
  private String comment;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}