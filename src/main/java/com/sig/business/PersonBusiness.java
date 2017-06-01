package com.sig.business;

import java.util.List;

import com.sig.common.dto.PersonDto;

public interface PersonBusiness {
	
	public List<PersonDto> getAllPeople();
	public void addPerson(PersonDto person);
	public PersonDto updatePerson(PersonDto person);
	
}
