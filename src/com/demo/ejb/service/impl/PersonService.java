package com.demo.ejb.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.ejb.bean.Person;

//@Entity(name="xxx")
@Stateless
@Remote(PersonService.class)
public class PersonService implements com.demo.ejb.service.PersonService {
	// configure the property of unitName using the value in the xml file.
	@PersistenceContext(unitName = "test")
	EntityManager em;

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		em.persist(person);
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		em.merge(person);
	}

	@Override
	public void delete(Integer personid) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(Person.class, personid));
	}

	@Override
	public Person getPerson(Integer personid) {
		// TODO Auto-generated method stub
		return em.find(Person.class, personid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return (List<Person>) em.createQuery("select o from Person o");
	}

}
