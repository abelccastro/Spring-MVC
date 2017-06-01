package com.sig.business.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sig.business.PersonBusiness;
import com.sig.common.dto.PersonDto;
import com.sig.domain.Person;
import com.sig.repository.mapper.PersonMapper;

@Service
public class PersonBusinessImpl implements PersonBusiness {
	@Autowired
	private PersonMapper personMapper;
	
	public List<PersonDto> getAllPeople() {
		List<Person> entityPerson =personMapper.getAllPeople();
		List<PersonDto> object = new ArrayList<PersonDto>();
		for(Person person : entityPerson){
			PersonDto personDto = new PersonDto();
			BeanUtils.copyProperties(person, personDto);
			object.add(personDto);
		}
		
		return object;
	}

	public void addPerson(PersonDto personDto) {
		Person personBean = new Person();
		BeanUtils.copyProperties(personDto,personBean);
		personMapper.addPerson(personBean);
		
	}

	public PersonDto updatePerson(PersonDto personDto) {
		Person personBean = new Person();
		BeanUtils.copyProperties(personDto,personBean);
		personMapper.updatePerson(personBean);
		return personDto;
	}
}
