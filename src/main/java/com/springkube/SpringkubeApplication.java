package com.springkube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringkubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringkubeApplication.class, args);
	}

	@GetMapping("/hello")
	public @ResponseBody String hello(){
		return "Hello  World";
	}
}
