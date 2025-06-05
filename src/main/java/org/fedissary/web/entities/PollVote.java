package org.fedissary.web.entities;
import java.net.URI;
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
public final class PollVote {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private Account account_id;
  @Nullable
  private Poll poll_id;
  private Integer choice;
  @Lob
  private URI uri;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}