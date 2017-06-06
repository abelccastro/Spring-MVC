package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.Persona;

public interface PersonMapper {
	 List<Persona> getAllPeople();
	 void addPerson(Persona person);
	 void updatePerson(Persona person);
	 void deletePerson(Persona person);
}
