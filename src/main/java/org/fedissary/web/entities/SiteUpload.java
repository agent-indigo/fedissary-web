package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import com.nimbusds.common.contenttype.ContentType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
@Entity
public final class SiteUpload {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Column(
    unique = true
  )
  private String var;
  @Lob
  @Nullable
  private String file_file_name;
  @Lob
  @Nullable
  private ContentType file_content_type;
  @Nullable
  private Float file_file_size;
  @Lob
  @Nullable
  private String meta;
  @Nullable
  private LocalDateTime file_updated_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}