package com.rookies6.myspring4project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBoot4ProjectApplicationTests {

	public static void main(String[] args) {
		SpringBootApplication application = new SpringBootApplication(MySpringBoot4ProjectApplication.class);

		application.run(args);

	}
	@Test
	void contextLoads() {
	}

}
