package com.healthykids.services;

import java.util.List;

import com.healthykids.beans.PerfilDTO;
import com.healthykids.daos.DAOFactory;
import com.healthykids.interfaces.PerfilDAO;

public class PerfilService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	PerfilDAO objPerfilDAO = fabrica.getPerfilDAO();
	
	public List<PerfilDTO> listar(PerfilDTO perfil){
		return objPerfilDAO.listar(perfil);
	}
}
