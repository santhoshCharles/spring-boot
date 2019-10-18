package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan({"io.javabrains.springbootstarter.hello","io.javabrains.springbootstarter.course"})
@SpringBootApplication(scanBasePackages = {"io.javabrains.springbootstarter.hello","io.javabrains.springbootstarter.course"})
public class TopicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicApiApplication.class, args);
	}

}
