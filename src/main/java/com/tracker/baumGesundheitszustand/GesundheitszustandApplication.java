package com.tracker.baumGesundheitszustand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class GesundheitszustandApplication {

	public static void main(String[] args) {
		SpringApplication.run(GesundheitszustandApplication.class, args);
	}

}
