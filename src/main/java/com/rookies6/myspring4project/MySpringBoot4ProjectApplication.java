package com.rookies6.myspring4project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MySpringBoot4ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBoot4ProjectApplication.class, args);
	}

	@Bean
	public String mybean(){
		return "Hello Bean";
	}

}
