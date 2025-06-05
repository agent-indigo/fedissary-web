package org.fedissary.web.entities;
import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
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
      columnList = "visibility"
    )
  }
)
public final class Status {
  @Id
  private final UUID id = UUID.randomUUID();
  private Account account_id;
  @Nullable
  private Status in_reply_to_id;
  @Nullable
  private Status reblog_of_id;
  @Nullable
  private Account in_reply_to_account_id;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private URI uri;
  private Integer visibility;
  @Lob
  private String text;
  private Boolean sensitive = false;
  private Boolean spoiler_text = false;
  private Boolean reply = false;
  @Lob
  private URL url;
  @Lob
  @Nullable
  private String language;
  @Lob
  @Nullable
  private String conversation_id;
  @Nullable
  private Boolean local = true;
  @Nullable
  private String application_id;
  @Nullable
  private String poll_id;
  @Nullable
  private LocalDateTime deleted_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}