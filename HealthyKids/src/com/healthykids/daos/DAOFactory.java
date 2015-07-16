package com.healthykids.daos;

import com.healthykids.interfaces.FuncionalidadDAO;
import com.healthykids.interfaces.PerfilDAO;
import com.healthykids.interfaces.UsuarioDAO;

public abstract class DAOFactory {

	//Bases de Datos a Manejar
	private static final int MYSQL = 1;
	private static final int SQL = 2;

	//Ayuda a Seleccionar la Base de Datos con la que se va a Trabajar
	public static DAOFactory getDAOFactory(int qFactory) {
		switch (qFactory) {
		case MYSQL:
			return new MySQLDAOFactory();
		case SQL:
			return new SQLDAOFactory();
		default:
			return null;
		}
	}

	//Declaramos cada una de los Metodos DAO
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract PerfilDAO getPerfilDAO();
	public abstract FuncionalidadDAO getFuncionalidadDAO();

}
