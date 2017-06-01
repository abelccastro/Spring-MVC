package com.sig.rest.message;

import java.util.List;

import com.sig.common.dto.PersonDto;

public class GetPersonResponse {
	private List<PersonDto> people;

	public List<PersonDto> getPeople() {
		return people;
	}

	public void setPeople(List<PersonDto> people) {
		this.people = people;
	}
	
}
