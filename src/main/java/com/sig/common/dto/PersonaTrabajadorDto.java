package com.sig.common.dto;

import java.math.BigDecimal;
import java.util.Date;

public class PersonaTrabajadorDto {
	private Integer idPersona;
	private String codigo;
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private Date fecha_nacimiento;
	private Integer idTrabajador;
	private String cuspp;
	private char tipo_pension;
	private boolean carga_familiar;
	private String cargo;
	private Date fecha_ingreso_planilla;
	private BigDecimal sueldo_bruto;
	private String nro_cuenta_haberes;
	private Integer banco_id;
	private String nombreBanco;
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getIdTrabajador() {
		return idTrabajador;
	}
	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
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
	public Integer getBanco_id() {
		return banco_id;
	}
	public void setBanco_id(Integer banco_id) {
		this.banco_id = banco_id;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	
	
	
	
	
	
	
}
