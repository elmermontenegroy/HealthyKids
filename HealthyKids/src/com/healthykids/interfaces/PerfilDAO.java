package com.healthykids.interfaces;

import java.util.List;

import com.healthykids.beans.PerfilDTO;

public interface PerfilDAO {
	//Basicos
	public int insertar(PerfilDTO perfil);
	public int actualizar(PerfilDTO perfil);
	public List<PerfilDTO> listar(PerfilDTO perfil);
	public int eliminar(String perfilesId);

}
