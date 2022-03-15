package ru.itmo.aquacourseproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class AquaCourseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquaCourseProjectApplication.class, args);
	}
}
