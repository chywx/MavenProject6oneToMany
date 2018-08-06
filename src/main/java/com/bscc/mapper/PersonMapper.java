package com.bscc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bscc.beans.Person;

public interface PersonMapper {
	int addPerson(Person person);
		
	@Select("select * from person")
	List<Person> listPerson();
}
