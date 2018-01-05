package com.appian.microservices.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API Gateway, which is a reverse proxy application that uses Netflix Zuul to forward requests to the
 * service application.
 *
 * @author touré
 */
@SpringBootApplication
public class ApplicationGateway {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationGateway.class, args);
  }
}
