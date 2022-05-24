package com.pranjal.learning.jpa.jpain10steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pranjal.learning.jpa.jpain10steps.entity.Person;
import com.pranjal.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		Person user = new Person("Jack", "Admin");
		userDaoService.insert(user);
		log.info("New user is Created : "+user);
		
	}
	

	
}
