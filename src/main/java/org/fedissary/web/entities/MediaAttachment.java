package org.fedissary.web.entities;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.util.MimeType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public final class MediaAttachment {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  @ManyToOne
  private Account account_id;
  @Nullable
  @ManyToOne
  private Status status_id;
  @Nullable
  @ManyToOne
  private ScheduledStatus scheduled_status_id;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private String shortcode;
  @Lob
  private URL remote_url;
  @Lob
  private String type;
  @Lob
  @Nullable
  private String file_file_name;
  @Lob
  @Nullable
  private MimeType file_content_type;
  @Nullable
  private Float file_file_size;
  @Lob
  private String file_meta;
  @Lob
  @Nullable
  private String description;
  @Lob
  @Nullable
  private String blurhash;
  @Nullable
  private LocalDateTime file_updated_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}