package com.healthykids.beans;

public class FuncionalidadDTO {
	//Tipos de Datos
	private Integer funcionalidadId;
	private String descripcion;
	private String estado;
	private String tipo;
	//Otras variables
	
	//Constructors
	public FuncionalidadDTO() {
		
	}
	
	public FuncionalidadDTO(Integer funcionalidadId, String descripcion,
			String estado, String tipo) {
		super();
		this.funcionalidadId = funcionalidadId;
		this.descripcion = descripcion;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((funcionalidadId == null) ? 0 : funcionalidadId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionalidadDTO other = (FuncionalidadDTO) obj;
		if (funcionalidadId == null) {
			if (other.funcionalidadId != null)
				return false;
		} else if (!funcionalidadId.equals(other.funcionalidadId))
			return false;
		return true;
	}
	//obtener y establecer
	public Integer getFuncionalidadId() {
		return funcionalidadId;
	}
	public void setFuncionalidadId(Integer funcionalidadId) {
		this.funcionalidadId = funcionalidadId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
