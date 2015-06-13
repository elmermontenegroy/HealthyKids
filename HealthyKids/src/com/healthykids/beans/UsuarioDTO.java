package com.healthykids.beans;

public class UsuarioDTO {
	//tipos de Datos
	private Integer usuarioId;
	private String nombre;
	private String apellidos;
	private String usuario;
	private String clave;
	private Character estado;
	
	//Otras variables
	private boolean chbEliminar;
	
	//constructor
	public UsuarioDTO() {
	}
	
	public UsuarioDTO(Integer usuarioId, String nombre, String apellidos, String usuario, String clave, Character estado) {
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((usuarioId == null) ? 0 : usuarioId.hashCode());
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
		UsuarioDTO other = (UsuarioDTO) obj;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}	
	
	//obtener y establecer
	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}
	public boolean isChbEliminar() {
		return chbEliminar;
	}
	public void setChbEliminar(boolean chbEliminar) {
		this.chbEliminar = chbEliminar;
	}
}
