package org.fedissary.web.config;
import org.fedissary.web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
// import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
  @Autowired
  private final UserService userService = new UserService();
  private final DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
  // private final DefaultWebSecurityExpressionHandler defaultWebSecurityExpressionHandler = new DefaultWebSecurityExpressionHandler();
  // private final DefaultMethodSecurityExpressionHandler defaultMethodSecurityExpressionHandler = new DefaultMethodSecurityExpressionHandler();
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(12);
  }
  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
    daoAuthenticationProvider.setUserDetailsService(userService);
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    return daoAuthenticationProvider;
  }
  // @Bean
  // public RoleHierarchyImpl roleHierarchy() {
  //   return RoleHierarchyImpl.fromHierarchy("ROLE_ROOT > ROLE_ADMIN > ROLE_MODERATOR > ROLE_USER");
  // }
  // @Bean
  // public DefaultWebSecurityExpressionHandler webSecurityExpressionHandler() {
  //   defaultWebSecurityExpressionHandler.setRoleHierarchy(roleHierarchy());
  //   return defaultWebSecurityExpressionHandler;
  // }
  // @Bean
  // public DefaultMethodSecurityExpressionHandler methodSecurityExpressionHandler() {
  //   defaultMethodSecurityExpressionHandler.setRoleHierarchy(roleHierarchy());
  //   return defaultMethodSecurityExpressionHandler;
  // }
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity chain) throws Exception {
    chain.authenticationProvider(daoAuthenticationProvider);
    return chain.build();
  }
}