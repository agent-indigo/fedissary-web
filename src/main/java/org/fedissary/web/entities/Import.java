package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import com.nimbusds.common.contenttype.ContentType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
@Entity
public final class Import {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  private Integer type;
  private Boolean approved = true;
  private Boolean overwrite = true;
  @Lob
  @Nullable
  private String data_file_name;
  @Lob
  @Nullable
  private ContentType data_content_type;
  @Nullable
  private Float data_file_size;
  @Nullable
  private LocalDateTime data_updated_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}