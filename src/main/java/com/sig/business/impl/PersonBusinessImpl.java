package com.sig.business.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sig.business.PersonBusiness;
import com.sig.common.dto.PersonDto;
import com.sig.common.dto.PersonaTrabajadorDto;
import com.sig.domain.Persona;
import com.sig.domain.PersonaTrabajador;
import com.sig.repository.mapper.PersonMapper;
import com.sig.repository.mapper.PersonalMapper;

@Service
public class PersonBusinessImpl implements PersonBusiness {
	@Autowired
	private PersonMapper personMapper;
	@Autowired
	private PersonalMapper personalMapper;
	
	public List<PersonDto> getAllPeople() {
		List<Persona> entityPerson =personMapper.getAllPeople();
		List<PersonDto> object = new ArrayList<PersonDto>();
		for(Persona person : entityPerson){
			PersonDto personDto = new PersonDto();
			BeanUtils.copyProperties(person, personDto);
			object.add(personDto);
		}
		
		return object;
	}

	public void addPerson(PersonDto personDto) {
		Persona personBean = new Persona();
		BeanUtils.copyProperties(personDto,personBean);
		personMapper.addPerson(personBean);
		
	}

	public PersonDto updatePerson(PersonDto personDto) {
		Persona personBean = new Persona();
		BeanUtils.copyProperties(personDto,personBean);
		personMapper.updatePerson(personBean);
		return personDto;
	}

	@Override
	public List<PersonaTrabajadorDto> getAllPersonal() {
		List<PersonaTrabajador> entityPerson =personalMapper.getPersonal();
		List<PersonaTrabajadorDto> object = new ArrayList<PersonaTrabajadorDto>();
		for(PersonaTrabajador person : entityPerson){
			PersonaTrabajadorDto personDto = new PersonaTrabajadorDto();
			BeanUtils.copyProperties(person, personDto);
			object.add(personDto);
		}
		
		return object;
	}
}
