package com.appian.microservices.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * API Gateway, which is a reverse proxy application that uses Netflix Zuul to forward requests to the
 * service application.
 *
 * @author touré
 */
@SpringBootApplication
@EnableZuulProxy
@RefreshScope
@Configuration
public class ApiGateway {

  @Bean
  @RefreshScope
  @ConfigurationProperties("zuul")
  public ZuulProperties zuulProperties() {
    return new ZuulProperties();
  }

  @Bean
  public RequestLoggerFilter requestLoggerFilter() {
    return new RequestLoggerFilter();
  }

  public static void main(String[] args) {
    SpringApplication.run(ApiGateway.class, args);
  }
}
