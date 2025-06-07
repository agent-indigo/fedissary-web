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
import lombok.Data;
@Data
@Entity
public final class PreviewCard {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Column(
    unique = true
  )
  private URL url;
  @Lob
  private String title;
  @Lob
  private String description;
  private Integer type;
  @Lob
  private String html;
  @Lob
  private String author_name;
  @Lob
  private URL author_url;
  @Lob
  private String provider_name;
  @Lob
  private URL provider_url;
  private Float width;
  private Float height;
  @Lob
  private URL embed_url;
  @Lob
  @Nullable
  private String image_file_name;
  @Lob
  @Nullable
  private MimeType image_content_type;
  @Nullable
  private Float image_file_size;
  @Nullable
  private LocalDateTime image_updated_at;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}