package org.zerock.club1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Club1Application {

	public static void main(String[] args) {
		SpringApplication.run(Club1Application.class, args);
	}

}
