package com.healthykids.services;

import java.util.List;

import com.healthykids.beans.PerfilDTO;
import com.healthykids.beans.UsuarioDTO;
import com.healthykids.daos.DAOFactory;
import com.healthykids.interfaces.PerfilDAO;

public class PerfilService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	PerfilDAO objPerfilDAO = fabrica.getPerfilDAO();
	
	public int insertar(PerfilDTO perfil){
		return objPerfilDAO.insertar(perfil);
	}
	
	public int actualizar(PerfilDTO perfil){
		return objPerfilDAO.actualizar(perfil);
	}
	
	public List<PerfilDTO> listar(PerfilDTO perfil){
		return objPerfilDAO.listar(perfil);
	}
	
	public int eliminar(String perfilesId){
		return objPerfilDAO.eliminar(perfilesId);
	}
	
}
