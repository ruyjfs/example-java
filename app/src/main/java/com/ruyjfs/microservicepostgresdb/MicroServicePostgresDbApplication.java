package com.ruyjfs.microservicepostgresdb;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@SpringBootApplication
@Log4j2
@EnableJpaAuditing
@EnableJdbcAuditing
public class MicroServicePostgresDbApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(MicroServicePostgresDbApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
    final var ctx = app.run(args);

    var env = ctx.getEnvironment();
    var serverPort = env.getProperty("local.server.port");
    log.info("\n###\n\n" + "http://localhost:" + serverPort + "/\n\n###");
  }

}
