package org.fedissary.web.entities;
import java.net.URI;
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
import lombok.Data;
@Data
@Entity
public final class CustomEmoji {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Column(
    unique = true
  )
  private String shortcode;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private URL domain;
  private Boolean disabled = false;
  @Nullable
  private Boolean visible_in_picker = true;
  @Lob
  @Nullable
  private String image_file_name;
  @Lob
  @Nullable
  private MimeType image_file_type;
  @Nullable
  private Float image_file_size;
  @Lob
  @Nullable
  private URI uri;
  @Lob
  @Nullable
  private URL image_remote_url;
  @Lob
  @Nullable
  private String category_id;
  @Nullable
  private LocalDateTime uploaded_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}