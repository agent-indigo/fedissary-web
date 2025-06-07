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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public final class Follow {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private Account account_id;
  @OneToOne
  private Account target_account_id;
  private Boolean show_reblogs = true;
  @Lob
  @Nullable
  private URI uri;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}