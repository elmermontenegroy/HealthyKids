package com.healthykids.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthykids.controls.Select;
import com.healthykids.utils.ControlUtils;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesar(request, response);
	}

	private void procesar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String accion = request.getParameter("accion");
		String control = request.getParameter("control");
		if(accion!=null){
			switch (accion) {
				case "listar": listar(request, response); break;
				case "insertar": insertar(request, response); break;
				case "actualizar": actualizar(request, response); break;
			}	
		}
		if(control!=null){
			switch (control) {
				case "lcomboUsuarios": lcomboUsuarios(request, response); break;
			}
		}
	}
	//Metodos Normales
	private void listar(HttpServletRequest request, HttpServletResponse response){
		
	}

	private void insertar(HttpServletRequest request, HttpServletResponse response){
		
	}
	
	private void actualizar(HttpServletRequest request, HttpServletResponse response){
		
	}
	//Carga de Controles
	private void lcomboUsuarios(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain");
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		
		List<Select> select=new ArrayList<>();
		select.add(new Select("nombre", "Nombre", true));
		select.add(new Select("apellido", "Apellido", false));
		select.add(new Select("usuario", "Usuario", false));
		select.add(new Select("estado", "Estado", false));
		
		out.print(ControlUtils.fillSelect(select));	
	}
}
