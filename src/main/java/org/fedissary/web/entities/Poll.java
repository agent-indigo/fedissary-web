package org.fedissary.web.entities;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
@Data
@Entity
public final class Poll {
  @Id
  private final UUID id = UUID.randomUUID();
  @Nullable
  private Account account_id;
  @Nullable
  private Status status_id;
  @Lob
  private Set<String> options;
  private List<Integer> cached_tallies;
  private Boolean multiple = false;
  private Boolean hide_totals = false;
  private Integer votes_count = 0;
  private Float lock_Version;
  @Nullable
  private LocalDateTime expires_at;
  @Nullable
  private LocalDateTime last_fetched_at;
  @Nullable
  private Integer voters_count = 0;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}