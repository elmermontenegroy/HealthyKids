package com.healthykids.daos;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthykids.beans.UsuarioDTO;
import com.healthykids.interfaces.UsuarioDAO;
import com.healthykids.utils.MySQLConexion;

public class MySQLUsuarioDAO implements UsuarioDAO {

	public int insertar(UsuarioDTO usuario) {
		
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		int result=0;
		
		try {
			con = MySQLConexion.getConexion();
			sp ="{call sp_Usuario_Insertar(?, ?, ?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setString(1, usuario.getNombre());
			cst.setString(2, usuario.getApellidos());
			cst.setString(3, usuario.getUsuario());
			cst.setString(4, usuario.getClave());
			cst.setString(5, usuario.getEstado().toString());
			
			result = cst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - insertar -> Error en la Conexión: "+e.getMessage());
		} finally{
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - insertar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		return result;
	}

	public int actualizar(UsuarioDTO usuario) {
		
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		int result=0;
		
		try {
			con = MySQLConexion.getConexion();
			sp ="{call sp_Usuario_Actualizar(?, ?, ?, ?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, usuario.getUsuarioId()!=null?usuario.getUsuarioId():0);
			cst.setString(2, usuario.getNombre()!=null?usuario.getNombre():"");
			cst.setString(3, usuario.getApellidos()!=null?usuario.getApellidos():"");
			cst.setString(4, usuario.getUsuario()!=null?usuario.getUsuario():"");
			cst.setString(5, usuario.getClave()!=null?usuario.getClave():"");
			cst.setString(6, usuario.getEstado()!=null?usuario.getEstado().toString():"");
			
			result = cst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - actualizar -> Error en la Conexión: "+e.getMessage());
		} finally{
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - actualizar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		return result;
	}

	public List<UsuarioDTO> listar(UsuarioDTO usuario) {

		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<UsuarioDTO> result = new ArrayList<UsuarioDTO>();
		UsuarioDTO u;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_Usuario_Listar(?, ?, ?, ?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, usuario.getUsuarioId()!=null?usuario.getUsuarioId():0);
			cst.setString(2, usuario.getNombre()!=null?usuario.getNombre():"");
			cst.setString(3, usuario.getApellidos()!=null?usuario.getApellidos():"");
			cst.setString(4, usuario.getUsuario()!=null?usuario.getUsuario():"");
			cst.setString(5, usuario.getClave()!=null?usuario.getClave():"");
			cst.setString(6, usuario.getEstado()!=null?usuario.getEstado().toString():"");
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				u = new UsuarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6).charAt(0));
				result.add(u);
			}
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - listar -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - listar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		// TODO Auto-generated method stub
		return result;
	}

	public int eliminar(Integer usuarioId) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		int result=0;
		
		try {
			con = MySQLConexion.getConexion();
			sp ="{call sp_Usuario_Eliminar(?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, usuarioId);
			
			result = cst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - actualizar -> Error en la Conexión: "+e.getMessage());
		} finally{
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - actualizar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		return result;
	}
	//Otros Metodos
	public UsuarioDTO loguear(UsuarioDTO usuario) {

		Connection con = null;
		CallableStatement cst = null;
		String sp;
		UsuarioDTO result = null;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_Usuario_Loguear(?, ?)}";
			cst = con.prepareCall(sp);

			cst.setString(1, usuario.getUsuario());
			cst.setString(2, usuario.getClave());
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				result = new UsuarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6).charAt(0));
			}
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - listar -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - listar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		// TODO Auto-generated method stub
		return result;
	}
}
