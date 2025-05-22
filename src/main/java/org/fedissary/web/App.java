package org.fedissary.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(
  exclude = {
	SecurityAutoConfiguration.class
  }
)
@ComponentScan(
  basePackages = {
  	"org.fedissary.web.config",
  	"org.fedissary.web.controllers.rest",
  	"org.fedissary.web.interfaces.repositories",
  	"org.fedissary.web.services"
  }
)
public class App {
  public static void main(String[] args) {
	SpringApplication.run(
	  App.class,
	  args
	);
  }
}