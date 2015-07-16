package com.healthykids.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthykids.beans.FuncionalidadDTO;
import com.healthykids.beans.PerfilDTO;
import com.healthykids.interfaces.FuncionalidadDAO;
import com.healthykids.utils.MySQLConexion;

public class MySQLFuncionalidadDAO implements FuncionalidadDAO {

	@Override
	public List<FuncionalidadDTO> listar(FuncionalidadDTO funcionalidad) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<FuncionalidadDTO> result = new ArrayList<FuncionalidadDTO>();
		FuncionalidadDTO f;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_funcionalidad_listar(?, ?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, funcionalidad.getFuncionalidadId()!=null?funcionalidad.getFuncionalidadId():0);
			cst.setString(2, funcionalidad.getDescripcion()!=null?funcionalidad.getDescripcion():"");
			cst.setString(3, funcionalidad.getEstado()!=null?funcionalidad.getEstado():"");
			cst.setString(4, funcionalidad.getTipo()!=null?funcionalidad.getTipo():"");
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				f = new FuncionalidadDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				result.add(f);
			}
			
		} catch (Exception e) {
			System.out.println("MySQLFuncionalidadDAO - listar -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLFuncionalidadDAO - listar -> No se pudo Cerrar la Conexión: "+e.getMessage());
			} 
		}
		
		return result;
	}

}
