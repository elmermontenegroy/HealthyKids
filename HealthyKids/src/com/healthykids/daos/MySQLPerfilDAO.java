package com.healthykids.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthykids.beans.PerfilDTO;
import com.healthykids.beans.UsuarioDTO;
import com.healthykids.interfaces.PerfilDAO;
import com.healthykids.utils.FechaUtils;
import com.healthykids.utils.MySQLConexion;

public class MySQLPerfilDAO implements PerfilDAO{

	@Override
	public int insertar(PerfilDTO perfil) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(PerfilDTO perfil) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PerfilDTO> listar(PerfilDTO perfil) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<PerfilDTO> result = new ArrayList<PerfilDTO>();
		PerfilDTO p;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_perfil_listar(?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, perfil.getPerfilId()!=null?perfil.getPerfilId():0);
			cst.setString(2, perfil.getDescripcion()!=null?perfil.getDescripcion():"");
			cst.setString(3, perfil.getEstado()!=null?perfil.getEstado():"");
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				p = new PerfilDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
				result.add(p);
			}
			
		} catch (Exception e) {
			System.out.println("MySQLPerfilDAO - listar -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLPerfilDAO - listar -> No se pudo Cerrar la Conexión: "+e.getMessage());
			} 
		}
		
		return result;
	}

	@Override
	public int eliminar(Integer perfilId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
