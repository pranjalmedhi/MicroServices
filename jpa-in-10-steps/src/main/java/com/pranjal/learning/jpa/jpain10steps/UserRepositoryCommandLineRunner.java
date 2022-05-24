package com.pranjal.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pranjal.learning.jpa.jpain10steps.entity.Person;
import com.pranjal.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Person user = new Person("Jill","Admin");
		userRepository.save(user);
		//userRepository.findById(1L);
		log.info("New user Created : " + user);
		log.info("User is : " + userRepository.findById(1L));
		log.info("User are : " + userRepository.findAll());

	}

}
