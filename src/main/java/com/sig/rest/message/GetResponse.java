package com.sig.rest.message;

import java.util.List;

import com.sig.common.dto.PersonDto;

public class  GetResponse <T> {
	private List<T> response;

	public List<T> getResponse() {
		return response;
	}

	public void setResponse(List<T> response) {
		this.response = response;
	}
	
}
