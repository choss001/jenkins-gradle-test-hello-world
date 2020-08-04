package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
  
  
  @Value("${val}")
  private String val;
  
  private final OrderService orderService;

  public controller (OrderService orderService) {
    this.orderService = orderService;
  }
  
  @GetMapping("/")
  public String test() {
    return "Hello World!!";
  }
  
  @GetMapping("/test")
  public String test1() {
    orderService.order();
    return val;
  }
}
