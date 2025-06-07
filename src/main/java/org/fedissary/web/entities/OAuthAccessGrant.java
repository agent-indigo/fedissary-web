package org.fedissary.web.entities;
import java.net.URL;
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
public final class OAuthAccessGrant {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private OAuthApplication application_id;
  @ManyToOne
  private User resource_owner_id;
  @Lob
  @Column(
    unique = true
  )
  private String token;
  private Integer expires_in = 0;
  @Lob
  private URL redirect_url;
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