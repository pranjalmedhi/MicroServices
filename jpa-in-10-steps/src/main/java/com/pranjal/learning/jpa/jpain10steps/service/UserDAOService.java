package com.pranjal.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.pranjal.learning.jpa.jpain10steps.entity.Person;

@Repository //A repository which interact with Database
@Transactional //Maintain transaction, Declarative transaction management.
public class UserDAOService {
	
	@PersistenceContext //to track by the context
	private EntityManager entityManager;
	
	public long insert(Person user) {
		entityManager.persist(user);
		return user.getId();
	}

}
