package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public final class AccountIdentityProof {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  @ManyToOne
  private Account account_id;
  @Lob
  @Column(
    unique = true
  )
  private String provider;
  @Lob
  private String provider_username;
  @Lob
  private String token;
  private Boolean verified = false;
  private Boolean live = false;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}