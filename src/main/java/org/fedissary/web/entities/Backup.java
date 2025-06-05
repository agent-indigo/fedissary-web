package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.util.MimeType;
import com.nimbusds.common.contenttype.ContentType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
@Entity
public final class Backup {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private User user_id;
  private Boolean processed = false;
  @Lob
  @Nullable
  private String dump_file_name;
  @Lob
  @Nullable
  private MimeType dump_file_type;
  @Lob
  @Nullable
  private ContentType dump_content_type;
  @Nullable
  private Float dump_file_size;
  @Nullable
  private LocalDateTime dump_updated_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}