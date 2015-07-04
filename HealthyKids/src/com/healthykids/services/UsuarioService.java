package com.healthykids.services;

import java.util.List;

import com.healthykids.beans.UsuarioDTO;
import com.healthykids.daos.DAOFactory;
import com.healthykids.interfaces.UsuarioDAO;

public class UsuarioService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	UsuarioDAO objUsuarioDAO = fabrica.getUsuarioDAO();

	public int insertar(UsuarioDTO usuario){
		return objUsuarioDAO.insertar(usuario);
	}
	
	public int actualizar(UsuarioDTO usuario){
		return objUsuarioDAO.actualizar(usuario);
	}
	
	public List<UsuarioDTO> listar(UsuarioDTO usuario){
		return objUsuarioDAO.listar(usuario);
	}
	
	public int eliminar(String usuariosId){
		return objUsuarioDAO.eliminar(usuariosId);
	}
	
	//Otros Metodos
	public UsuarioDTO loguear(UsuarioDTO usuario){
		return objUsuarioDAO.loguear(usuario);
	}
	
}
