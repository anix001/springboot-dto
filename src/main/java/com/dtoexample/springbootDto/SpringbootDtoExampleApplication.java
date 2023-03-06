package com.dtoexample.springbootDto;

import com.dtoexample.springbootDto.model.Location;
import com.dtoexample.springbootDto.model.User;
import com.dtoexample.springbootDto.repository.LocationRepository;
import com.dtoexample.springbootDto.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoExampleApplication implements CommandLineRunner {

	public SpringbootDtoExampleApplication(UserRepository userRepository, LocationRepository locationRepository) {
		this.userRepository = userRepository;
		this.locationRepository = locationRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoExampleApplication.class, args);
	}

	private final UserRepository userRepository;
	private final LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Manpur");
		location.setDescription("A cool village");
		location.setLongitude(40.80);
		location.setLatitude(30);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("anish");
		user1.setLastName("chaudhary");
		user1.setEmail("njknfjknjk@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("nani");
		user2.setLastName("chaudhary");
		user2.setEmail("njknfjknjk@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
