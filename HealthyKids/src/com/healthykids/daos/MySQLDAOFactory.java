package com.healthykids.daos;

import com.healthykids.interfaces.UsuarioDAO;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySQLUsuarioDAO();
	}

}
