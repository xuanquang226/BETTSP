package com.quangxuan.springakafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan(value = {"controller", "services", "data"})
@EntityScan(basePackages = {"data.entities"})
@EnableJpaRepositories(basePackages =  {"data.repositories"})
@OpenAPIDefinition(info = @Info(title = "Library Apis", version = "1.0", description = "Library Management Apis"))
public class SpringakafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringakafkaApplication.class, args);
	}

	// @Bean
	// NewTopic notification(){
	// 	return new NewTopic("notification", 2, (short)1);
	// }

}
