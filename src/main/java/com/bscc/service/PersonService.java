package com.bscc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bscc.beans.Person;
import com.bscc.mapper.PersonMapper;

@Service
public class PersonService {
	@Autowired
	private PersonMapper mapper;
	
	public int addPerson(Person person){
		return mapper.addPerson(person);
	}
	
	public List<Person> listPerson(){
		return mapper.listPerson();
	}
}
