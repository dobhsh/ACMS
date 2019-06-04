package com.acmsmongo.mongo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.acmsmongo.mongo1.repository")
public class MongoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}
	
	public void run() {
	}
}
