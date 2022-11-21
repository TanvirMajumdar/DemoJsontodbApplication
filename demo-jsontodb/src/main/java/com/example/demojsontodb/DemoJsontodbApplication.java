package com.example.demojsontodb;

import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.model.Users;
import com.example.demojsontodb.service.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DemoJsontodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJsontodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Users>> typeReference = new TypeReference<List<Users>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try {
				List<Users> users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
