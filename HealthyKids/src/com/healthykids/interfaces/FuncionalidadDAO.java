package com.healthykids.interfaces;

import java.util.List;

import com.healthykids.beans.FuncionalidadDTO;
import com.healthykids.beans.UsuarioDTO;

public interface FuncionalidadDAO {
	//Declaramos los metodos para cada una de las acciones a realizar en la BD
	//Basicos
	public List<FuncionalidadDTO> listar(FuncionalidadDTO funcionalidad);
}
