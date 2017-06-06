package com.sig.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trabajador implements Serializable {
	private Integer id;
	private String cuspp;
	private char tipo_pension;
	private boolean carga_familiar;
	private String cargo;
	private Date fecha_ingreso_planilla;
	private BigDecimal sueldo_bruto;
	private String nro_cuenta_haberes;
	private char estado;
	private Date fecha_registro;
	private Integer usuario;
	private String terminal;
	
	private Integer banco_id;
	private Integer persona_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCuspp() {
		return cuspp;
	}
	public void setCuspp(String cuspp) {
		this.cuspp = cuspp;
	}
	public char getTipo_pension() {
		return tipo_pension;
	}
	public void setTipo_pension(char tipo_pension) {
		this.tipo_pension = tipo_pension;
	}
	public boolean isCarga_familiar() {
		return carga_familiar;
	}
	public void setCarga_familiar(boolean carga_familiar) {
		this.carga_familiar = carga_familiar;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getFecha_ingreso_planilla() {
		return fecha_ingreso_planilla;
	}
	public void setFecha_ingreso_planilla(Date fecha_ingreso_planilla) {
		this.fecha_ingreso_planilla = fecha_ingreso_planilla;
	}
	public BigDecimal getSueldo_bruto() {
		return sueldo_bruto;
	}
	public void setSueldo_bruto(BigDecimal sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	public String getNro_cuenta_haberes() {
		return nro_cuenta_haberes;
	}
	public void setNro_cuenta_haberes(String nro_cuenta_haberes) {
		this.nro_cuenta_haberes = nro_cuenta_haberes;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Integer getUsuario() {
		return usuario;
	}
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public Integer getBanco_id() {
		return banco_id;
	}
	public void setBanco_id(Integer banco_id) {
		this.banco_id = banco_id;
	}
	public Integer getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(Integer persona_id) {
		this.persona_id = persona_id;
	}
	
	
	
	
	
	
}
