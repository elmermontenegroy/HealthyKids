package com.healthykids.interfaces;

import java.util.List;

import com.healthykids.beans.UsuarioDTO;

public interface UsuarioDAO {
	//Declaramos los metodos para cada una de las acciones a realizar en la BD
	//Basicos
	public int insertar(UsuarioDTO usuario);
	public int actualizar(UsuarioDTO usuario);
	public List<UsuarioDTO> listar(UsuarioDTO usuario);
	public int eliminar(Integer usuarioId);
	
	//Avanzados
	public UsuarioDTO loguear(UsuarioDTO usuario);
}
