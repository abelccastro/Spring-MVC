package com.sig.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sig.domain.Banco;
import com.sig.domain.Persona;
import com.sig.domain.Planilla;

public interface PlanillaMapper {
	 List<Planilla> getAll();
	 void addPlanilla(Planilla planilla);
	 void updatePlanilla(Planilla planilla);
	 void deletePlanilla(Planilla planilla);
}
