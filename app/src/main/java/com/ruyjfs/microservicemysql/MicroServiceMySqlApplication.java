package com.ruyjfs.microservicemysql;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;

@SpringBootApplication
@Log4j2
@EnableJpaAuditing
@EnableJdbcAuditing
@EnableJpaRepositories
public class MicroServiceMySqlApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(MicroServiceMySqlApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
    final var ctx = app.run(args);

    var env = ctx.getEnvironment();
    var serverPort = env.getProperty("local.server.port");
    log.info("\n###\n\n" + "http://localhost:" + serverPort + "/\n\n###");
  }

}
