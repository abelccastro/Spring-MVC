package com.sig.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.business.PersonBusiness;
import com.sig.common.dto.PersonDto;
import com.sig.common.dto.PersonaTrabajadorDto;
import com.sig.rest.message.GetPersonRequest;
import com.sig.rest.message.GetPersonResponse;
import com.sig.rest.message.GetResponse;

@RestController
@RequestMapping("/person")
public class RegistroPersonController {
	
	@Autowired
	private PersonBusiness personBusiness;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)		
	public  @ResponseBody GetPersonResponse  getAll(){
		
		GetPersonResponse response = new GetPersonResponse();
		List<PersonDto>  people = personBusiness.getAllPeople();	 
		response.setPeople(people);
		return response;
	}
	
	@RequestMapping(value = "/getPersonal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)		
	public  @ResponseBody GetResponse<PersonaTrabajadorDto>  getPersonal(){
		
		GetResponse<PersonaTrabajadorDto> response = new GetResponse();
		List<PersonaTrabajadorDto>  people = personBusiness.getAllPersonal();	 
		response.setResponse(people);
		return response;
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody void set(@RequestBody GetPersonRequest request){
		
		GetPersonResponse response = new GetPersonResponse();
		PersonDto person = request.getPerson();
		personBusiness.addPerson(person);
	}
	
	@RequestMapping(value ="/update",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void update(@RequestBody GetPersonRequest request){
		
		GetPersonResponse response = new GetPersonResponse();
		PersonDto person = request.getPerson();
		personBusiness.updatePerson(person);
	}

}
