package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.Trabajador;

public interface TrabajadorMapper {
	 List<Trabajador> getAll();
	 void addTrabajador(Trabajador trabajador);
	 void updateTrabajador(Trabajador trabajador);
	 void deleteTrabajador(Trabajador trabajador);
}
