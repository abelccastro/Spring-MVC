package com.sig.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HorasTrabajador implements Serializable {
	private Integer id;
	private Integer total_horas;
	private Integer horas_extra;
	private BigDecimal descuento_canasta;
	private BigDecimal retencion_judicial;
	private BigDecimal adelanto;
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
	public Integer getTotal_horas() {
		return total_horas;
	}
	public void setTotal_horas(Integer total_horas) {
		this.total_horas = total_horas;
	}
	public Integer getHoras_extra() {
		return horas_extra;
	}
	public void setHoras_extra(Integer horas_extra) {
		this.horas_extra = horas_extra;
	}
	public BigDecimal getDescuento_canasta() {
		return descuento_canasta;
	}
	public void setDescuento_canasta(BigDecimal descuento_canasta) {
		this.descuento_canasta = descuento_canasta;
	}
	public BigDecimal getRetencion_judicial() {
		return retencion_judicial;
	}
	public void setRetencion_judicial(BigDecimal retencion_judicial) {
		this.retencion_judicial = retencion_judicial;
	}
	public BigDecimal getAdelanto() {
		return adelanto;
	}
	public void setAdelanto(BigDecimal adelanto) {
		this.adelanto = adelanto;
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
