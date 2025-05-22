package org.fedissary.web.entities;
import java.util.List;
import org.fedissary.web.abstracts.DataEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(
  callSuper = true
)
@ToString(
  callSuper = true
)
@Entity
@Table(
  name = "accounts"
)
public final class UserEntity extends DataEntity implements UserDetails {
  @Column(
    unique = true
  )
  private String username;
  @JsonIgnore
  private String password;
  private List<SimpleGrantedAuthority> authorities;
  private boolean accountNonExpired;
  private boolean accountNonLocked;
  private boolean credentialsNonExpired;
  private boolean enabled;
}