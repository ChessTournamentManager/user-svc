package com.chesstournamentmanager.usersvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserSvcApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to the user service.";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserSvcApplication.class, args);
	}

}
