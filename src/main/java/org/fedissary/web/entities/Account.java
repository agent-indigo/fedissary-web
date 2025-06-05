package org.fedissary.web.entities;
import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import com.nimbusds.common.contenttype.ContentType;
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
      columnList = "uri, url"
    )
  }
)
public final class Account {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private Account moved_to_account_id;
  @Lob
  private URI uri;
  @Lob
  @Nullable
  private URL url;
  @Lob
  private String username;
  @Lob
  private String secret;
  @Lob
  private String public_key;
  @Lob
  private URL remote_url;
  @Lob
  private URL salmon_url;
  @Lob
  private URL hub_url;
  @Lob
  private String note;
  @Lob
  private String display_name;
  private Boolean locked = false;
  @Lob
  private URL header_remote_url;
  @Lob
  private URL inbox_url;
  @Lob
  @Nullable
  private URL domain;
  @Lob
  @Nullable
  private String private_key;
  @Lob
  @Nullable
  private String avatar_file_name;
  @Lob
  @Nullable
  private ContentType avatar_content_type;
  @Lob
  @Nullable
  private Float avatar_file_size;
  @Nullable
  private LocalDateTime avatar_updated_at;
  @Lob
  @Nullable
  private String header_file_name;
  @Lob
  @Nullable
  private ContentType header_content_type;
  @Nullable
  private Float header_file_size;
  @Nullable
  private LocalDateTime header_updated_at;
  @Lob
  @Nullable
  private URL avatar_remote_url;
  @Nullable
  private LocalDateTime subscription_expires_at;
  @Nullable
  private LocalDateTime last_webfingered_at;
  @Lob
  @Nullable
  private URL outbox_url;
  @Lob
  @Nullable
  private URL shared_inbox_url;
  @Lob
  private URL followers_url;
  private Float protocol;
  private Boolean memorial = false;
  @Lob
  @Nullable
  private URL featured_collections_url;
  @Lob
  @Nullable
  private String fields;
  @Lob
  @Nullable
  private String actor_type;
  @Nullable
  private Boolean discoverable = true;
  @Lob
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> also_known_as;
  @Nullable
  private LocalDateTime silenced_at;
  @Nullable
  private LocalDateTime suspended_at;
  @Nullable
  private Integer trust_level;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}