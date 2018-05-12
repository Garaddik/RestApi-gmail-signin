package com.mk.mk;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkApplication.class, args);
	}

	@GetMapping(value = "/login")
	public String user() {

		return "success";
	}

	@GetMapping
	public Principal success(Principal principle) {

		return principle;
	}
}
