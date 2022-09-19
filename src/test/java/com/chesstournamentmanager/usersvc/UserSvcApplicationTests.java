package com.chesstournamentmanager.usersvc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserSvcApplicationTests {

	@Autowired
	private UserSvcApplication userSvcApplication;

	@Test
	void contextLoads() {
	}

	@Test
	void sendsWelcomeMessage() {
		assertThat(userSvcApplication.getMessage()).isEqualTo("Welcome to the user service.");
	}
}
