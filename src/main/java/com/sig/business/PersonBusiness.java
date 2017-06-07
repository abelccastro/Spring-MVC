package com.sig.business;

import java.util.List;

import com.sig.common.dto.PersonDto;
import com.sig.common.dto.PersonaTrabajadorDto;

public interface PersonBusiness {
	
	public List<PersonDto> getAllPeople();
	public void addPerson(PersonDto person);
	public PersonDto updatePerson(PersonDto person);
	public List<PersonaTrabajadorDto> getAllPersonal();
	
}
