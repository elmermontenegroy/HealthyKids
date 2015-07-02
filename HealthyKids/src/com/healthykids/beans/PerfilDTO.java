package com.healthykids.beans;

public class PerfilDTO {
	//Tipos de Datos
	private Integer perfilId;
	private String descripcion;
	private String estado;
	//Otras variables
	
	//Constructors
	public PerfilDTO() {
	}
	
	public PerfilDTO(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public PerfilDTO(Integer perfilId, String descripcion, String estado) {
		this.perfilId = perfilId;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((perfilId == null) ? 0 : perfilId.hashCode());
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
		PerfilDTO other = (PerfilDTO) obj;
		if (perfilId == null) {
			if (other.perfilId != null)
				return false;
		} else if (!perfilId.equals(other.perfilId))
			return false;
		return true;
	}
	//obtener y establecer
	public Integer getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
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
	
}
