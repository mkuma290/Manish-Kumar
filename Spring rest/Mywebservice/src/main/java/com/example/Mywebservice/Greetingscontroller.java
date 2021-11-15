package com.example.Mywebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetingscontroller {
	@GetMapping("/hello")
  public String greetings(@RequestParam(value= "n", defaultValue="world") String name)
  {
	  return String.format("Hello,%s!",name);
  }
}
