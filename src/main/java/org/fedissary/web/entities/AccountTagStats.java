package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public final class AccountTagStats {
  @Id
  private final UUID id = UUID.randomUUID();
  @OneToOne
  private Tag tag_id;
  private Integer accounts_count = 0;
  private Boolean hidden = false;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}