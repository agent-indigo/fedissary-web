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
import lombok.Data;
@Data
@Entity
public final class DomainBlock {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Column(
    unique = true
  )
  private URL domain;
  private Boolean reject_media = true;
  private Boolean reject_reports = true;
  @Nullable
  private Integer severity;
  @Lob
  @Nullable
  private String private_comment;
  @Lob
  @Nullable
  private String public_comment;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}