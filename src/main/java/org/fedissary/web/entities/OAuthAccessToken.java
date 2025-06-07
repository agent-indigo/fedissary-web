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
public final class OAuthAccessToken {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  @ManyToOne
  private OAuthApplication application_id;
  @Nullable
  @ManyToOne
  private RegisteredUser resource_owner_id;
  @Lob
  @Column(
    unique = true
  )
  private String token;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private String refresh_token;
  @Nullable
  private Integer expires_in = 0;
  @Nullable
  private LocalDateTime revoked_at;
  @Lob
  @Nullable
  private String scopes;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}