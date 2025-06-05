package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
@Entity
public final class Notification {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  private Account from_account_id;
  @Lob
  @Column(
    unique = true
  )
  private String activity_id;
  @Lob
  @Column(
    unique = true
  )
  private String activity_type;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}