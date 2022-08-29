package com.ruyjfs.microservicemongodb;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@SpringBootApplication
@Log4j2
@EnableMongoAuditing
@EnableMongoRepositories
//@EnableDiscoveryClient
//@ComponentScan({"com.ruyjfs.base"})
public class MicroServiceMongoDbApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(MicroServiceMongoDbApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
    final var ctx = app.run(args);

    var env = ctx.getEnvironment();
    var serverPort = env.getProperty("local.server.port");
    log.info("\n###\n\n" + "http://localhost:" + serverPort + "/\n\n###");
  }

}
