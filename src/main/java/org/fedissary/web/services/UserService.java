package org.fedissary.web.services;
import java.util.UUID;
import org.apache.coyote.BadRequestException;
import org.fedissary.web.entities.RegisteredUser;
import org.fedissary.web.interfaces.repositories.UserRepository;
import org.fedissary.web.records.NewPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public final class UserService implements UserDetailsService {
  @Autowired
  private UserRepository userRepository;
  private RegisteredUser target;
  private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
  public UserDetails loadUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }
  public UserDetails changePassword(
    UUID id,
    NewPassword newPassword
  ) throws BadRequestException {
    target = userRepository.findById(id).get();
    if (
      newPassword.currentPassword() == null |
      newPassword.newPassword() == null |
      newPassword.confirmNewPassword() == null
    ) {
      throw new BadRequestException("At least one field is empty.");
    } else if (!newPassword.newPassword().equals(newPassword.confirmNewPassword())) {
      throw new BadRequestException("Passwords do not match.");
    } else if (!passwordEncoder.matches(
      newPassword.currentPassword(),
      target.getPassword()
    )) {
      throw new BadRequestException("Incorrect password.");
    } else if (passwordEncoder.matches(
      newPassword.newPassword(),
      target.getPassword()
    )) {
      throw new BadRequestException("New password cannot be the same as the current password.");
    } else {
      target.setPassword(passwordEncoder.encode(newPassword.newPassword()));
      return userRepository.save(target);
    }
  }
}