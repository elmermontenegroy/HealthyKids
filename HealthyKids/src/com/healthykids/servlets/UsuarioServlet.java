package com.healthykids.servlets;

import java.io.IOException;	

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//Constructor
    public UsuarioServlet() {
        super();
    }
    
    //Metodos para obtener los parametros enviados por un request html
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		orquestador(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		orquestador(request, response);
	}
	
	//Orquestador
	private void orquestador(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String carga = request.getParameter("carga");
		String accion = request.getParameter("accion");
		if(carga!=null){
			cargarDatos(request, response);
		}
		if(accion!=null){
			switch (accion) {
				case "listar": listar(request, response); break;
				case "insertar": insertar(request, response); break;
				case "actualizar": actualizar(request, response); break;
			}	
		}
	}
	
	//Metodos de Carga
	private void cargarDatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*
		HttpSession session = request.getSession();
		session.setAttribute(arg0, arg1);
		*/
		request.setAttribute("ComboBusqueda", null);
		request.getRequestDispatcher("/recurso").forward (request, response);
	}
	
	//Metodos para Acciones Basicas
	private void listar(HttpServletRequest request, HttpServletResponse response){
	}
	private void insertar(HttpServletRequest request, HttpServletResponse response){
	}
	private void actualizar(HttpServletRequest request, HttpServletResponse response){
	}
	
	//Obtener y Establecer
	
}
