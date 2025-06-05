package org.fedissary.web.entities;
import java.net.URL;
import java.rmi.server.UID;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(
  indexes = {
    @Index(
      columnList = "owner_type"
    )
  }
)
public final class OAuthApplication {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private User owner_id;
  @Lob
  private UID uid;
  @Lob
  @Nullable
  private String owner_type;
  @Lob
  private String name;
  @Lob
  private String secret;
  @Lob
  @Nullable
  private URL redirect_uri;
  @Lob
  private String scopes;
  private Boolean superapp = false;
  private Boolean confidential = false;
  @Lob
  @Nullable
  private URL website;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}