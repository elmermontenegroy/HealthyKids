package com.healthykids.daos;

import com.healthykids.interfaces.FuncionalidadDAO;
import com.healthykids.interfaces.PerfilDAO;
import com.healthykids.interfaces.UsuarioDAO;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySQLUsuarioDAO();
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		return new MySQLPerfilDAO();
	}

	@Override
	public FuncionalidadDAO getFuncionalidadDAO() {
		return new MySQLFuncionalidadDAO();
	}

}
