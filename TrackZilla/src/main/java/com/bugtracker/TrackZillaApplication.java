package com.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.bugtracker.*")
@EntityScan("com.bugtracker.Entity")
@EnableJpaRepositories("com.bugtracker.Repository")
public class TrackZillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackZillaApplication.class, args);
	}

}
