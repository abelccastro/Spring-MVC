package com.sig.rest.message;

import com.sig.common.dto.PersonDto;

public class GetPersonRequest {
	private PersonDto person;

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}
	
	
}
