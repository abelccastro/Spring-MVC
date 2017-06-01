package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.Person;

public interface PersonMapper {
	 List<Person> getAllPeople();
	 void addPerson(Person person);
	 void updatePerson(Person person);
	
}
