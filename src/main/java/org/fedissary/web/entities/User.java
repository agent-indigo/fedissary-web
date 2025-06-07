package org.fedissary.web.entities;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(
  name = "users"
)
public final class User implements UserDetails {
  @Id
  private final UUID id = UUID.randomUUID();
  @Lob
  @Column(
    unique = true,
    name = "email"
  )
  private String username;
  public String getEmail() {
    return username;
  }
  public void setEmail(String email) {
    username = email;
  }
  @JsonIgnore
  @Lob
  private String password;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<SimpleGrantedAuthority> authorities;
  private Boolean accountNonExpired;
  private Boolean accountNonLocked;
  private Boolean credentialsNonExpired;
  private Boolean enabled;
  @OneToOne
  private Account account_id;
  @Nullable
  @OneToOne
  private Invite invite_id;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private String reset_password_token;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private String confirmation_token;
  @Lob
  @Nullable
  @Column(
    unique = true
  )
  private String remember_token;
  private Integer sign_in_count = 0;
  private Boolean root = false;
  private Boolean admin = false;
  private Boolean moderator = false;
  private Boolean otp_required_for_login = false;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> filtered_languages;
  private Boolean approved = true;
  @Nullable
  private LocalDateTime reset_password_sent_at;
  @Nullable
  private LocalDateTime remember_created_at;
  @Nullable
  private LocalDateTime current_sign_in_at;
  @Nullable
  private LocalDateTime last_sign_in_at;
  @Lob
  @Nullable
  private InetAddress current_sign_in_ip;
  @Lob
  @Nullable
  private InetAddress last_sign_in_ip;
  @Nullable
  private LocalDateTime confirmed_at;
  @Nullable
  private LocalDateTime confirmation_sent_at;
  @Lob
  @Nullable
  private String unconfirmed_email;
  @Lob
  @Nullable
  private String locale;
  @Lob
  @Nullable
  private String encrypted_otp_secret;
  @Lob
  @Nullable
  private String encrypted_otp_secret_iv;
  @Lob
  @Nullable
  private String encrypted_otp_secret_salt;
  @Nullable
  private Integer consumed_timestep = 0;
  @Nullable
  private LocalDateTime last_emailed_at;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> otp_backup_codes;
  // This should be represented as `_text` in the PostgreSQL database.
  private Set<String> chosen_languages;
  @Nullable
  @ManyToOne
  private OAuthApplication created_by_application_id;
  @CreatedDate
  private final LocalDateTime created_at = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updated_at;
}