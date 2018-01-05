package com.appian.microservices.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inventory application.
 *
 * @author touré
 */
@SpringBootApplication
@RestController
public class InventoryApplication {

  @RequestMapping(value = "/products")
  public String list() {
    return "list";
  }

  public static void main(String[] args) {
    SpringApplication.run(InventoryApplication.class, args);
  }
}
