package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.HorasTrabajador;
import com.sig.domain.Roles;
import com.sig.domain.Trabajador;

public interface RolesMapper {
	 List<Roles> getAll();
	 
	
}
