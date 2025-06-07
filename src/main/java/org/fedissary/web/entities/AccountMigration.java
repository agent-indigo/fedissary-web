package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public final class AccountMigration {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  @OneToOne
  private Account account_id;
  @Nullable
  @OneToOne
  private Account target_account_id;
  @Lob
  private String acct;
  private Integer followers_count = 0;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}