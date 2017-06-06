package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.Banco;
import com.sig.domain.Persona;

public interface BancoMapper {
	 List<Banco> getAll();
}
