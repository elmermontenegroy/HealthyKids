package com.healthykids.services;

import java.util.List;

import com.healthykids.beans.FuncionalidadDTO;
import com.healthykids.beans.PerfilDTO;
import com.healthykids.daos.DAOFactory;
import com.healthykids.interfaces.FuncionalidadDAO;
import com.healthykids.interfaces.PerfilDAO;

public class PerfilService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	PerfilDAO objPerfilDAO = fabrica.getPerfilDAO();
	FuncionalidadDAO objFuncionalidadDAO = fabrica.getFuncionalidadDAO();
	
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
	
	//Otros
	public List<FuncionalidadDTO> listarFuncionalidades(FuncionalidadDTO funcionalidad){
		return objFuncionalidadDAO.listar(funcionalidad);
	}
}
