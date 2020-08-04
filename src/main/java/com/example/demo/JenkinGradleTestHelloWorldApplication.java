package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinGradleTestHelloWorldApplication {

  @Value("${val}")
  private String val;

  @Autowired
  private OrderService orderService;

  // public JenkinGradleTestHelloWorldApplication (OrderService orderService) {
  // this.orderService = orderService;
  // }

  public static void main(String[] args) {
    SpringApplication.run(JenkinGradleTestHelloWorldApplication.class, args);
  }

   @PostConstruct
   public void test() {
   orderService.order();
  
   System.out.println("test : "+val);
   }

}
