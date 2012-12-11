package com.demo.ejb.service;

import java.util.List;

import com.demo.ejb.bean.Person;

public interface PersonService {
	public void save(Person person);
	public void update(Person person);
	public void delete(Integer personid);
	public Person getPerson(Integer personid);
	public List<Person> getPersons();
	
}
