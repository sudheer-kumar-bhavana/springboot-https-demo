package com.https.httpsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}

	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable String name){
		return "Hi "+ name;
	}
}
