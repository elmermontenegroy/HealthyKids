package com.healthykids.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthykids.beans.UsuarioDTO;
import com.healthykids.services.UsuarioService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Constructor
    public LoginServlet() {
        super();
        System.out.println("LoginServlet - Constructor");
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
		String accion = request.getParameter("accion");
		if(accion!=null){
			switch (accion) {
				case "login": login(request, response); break;
				case "logout": logout(request, response); break;
			}	
		}
	}
	
	//Metodos para Acciones Basicas
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UsuarioService servicio = new UsuarioService();

		String user = request.getParameter("txtUsuario");
		String pass = request.getParameter("txtClave");
				
		UsuarioDTO usuario = servicio.loguear(new UsuarioDTO(user, pass));

		RequestDispatcher rd;
		if (usuario!=null) {
			rd = request.getRequestDispatcher("/templates/master.jsp");
			HttpSession sesion= request.getSession();
			sesion.setAttribute("usuario",usuario);
		} else {
			rd = request.getRequestDispatcher("/pages/security/login.jsp?idioma=en");
			request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
		}

		rd.forward(request, response);

	}
	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getSession().invalidate();
		request.getRequestDispatcher("/pages/security/login.jsp?idioma=en").forward (request, response);
	}

}
