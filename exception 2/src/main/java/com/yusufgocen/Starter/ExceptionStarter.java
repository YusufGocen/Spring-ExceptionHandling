package com.yusufgocen.Starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EntityScan(basePackages = {"com.yusufgocen"})
@EnableJpaRepositories(basePackages = {"com.yusufgocen"})
@ComponentScan(basePackages = {"com.yusufgocen"})
@EnableScheduling
@SpringBootApplication
public class ExceptionStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionStarter.class, args);
	}

}
