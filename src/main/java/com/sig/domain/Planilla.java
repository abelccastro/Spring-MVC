package com.sig.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Planilla implements Serializable {
	
	private Integer id;
	private BigDecimal gratificacion;
	private BigDecimal cts;
	private BigDecimal remuneracion;
	private BigDecimal descuentos;
	private BigDecimal saldo_pagado;
	private BigDecimal aportes;
	private boolean boleta;
	private Integer trabajador_id;
	private char estado;
	private Date fecha_registro;
	private Integer usuario;
	private String terminal;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getGratificacion() {
		return gratificacion;
	}
	public void setGratificacion(BigDecimal gratificacion) {
		this.gratificacion = gratificacion;
	}
	public BigDecimal getCts() {
		return cts;
	}
	public void setCts(BigDecimal cts) {
		this.cts = cts;
	}
	public BigDecimal getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(BigDecimal remuneracion) {
		this.remuneracion = remuneracion;
	}
	public BigDecimal getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(BigDecimal descuentos) {
		this.descuentos = descuentos;
	}
	public BigDecimal getSaldo_pagado() {
		return saldo_pagado;
	}
	public void setSaldo_pagado(BigDecimal saldo_pagado) {
		this.saldo_pagado = saldo_pagado;
	}
	public BigDecimal getAportes() {
		return aportes;
	}
	public void setAportes(BigDecimal aportes) {
		this.aportes = aportes;
	}
	public boolean isBoleta() {
		return boleta;
	}
	public void setBoleta(boolean boleta) {
		this.boleta = boleta;
	}
	public Integer getTrabajador_id() {
		return trabajador_id;
	}
	public void setTrabajador_id(Integer trabajador_id) {
		this.trabajador_id = trabajador_id;
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
	
	
	
	
}
