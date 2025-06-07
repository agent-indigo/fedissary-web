package org.fedissary.web.entities;
import java.net.InetAddress;
import java.util.UUID;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public final class SessionActivation {
  @Id
  private final UUID id = UUID.randomUUID();
  @ManyToOne
  private RegisteredUser user_id;
  @Nullable
  @OneToOne
  private OAuthAccessToken access_token_id;
  @Lob
  @Column(
    unique = true
  )
  private String session_id;
  @Lob
  private String user_agent;
  @Nullable
  private InetAddress ip;
  @Nullable
  private Integer web_push_subscription_id;
}