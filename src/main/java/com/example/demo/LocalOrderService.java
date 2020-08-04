package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class LocalOrderService implements OrderService{
  
  @Value("${val}")
  private String val;

  @Value("${val2}")
  private String val2;
  
  @Override
  public void order() {
    System.out.println(val);
    System.out.println(val2);
  }

}
