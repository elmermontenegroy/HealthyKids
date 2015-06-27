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

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	
	private void procesar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// variables de captura de datos
		String user = request.getParameter("txtUsuario");
		String pass = request.getParameter("txtClave");
				
		// -- Busca el usuario y clave en la BD
		UsuarioService servicio = new UsuarioService();
		UsuarioDTO usuario = servicio.loguear(new UsuarioDTO(user, pass));

		// -- nos envia a la pagina bienvenido.jps junto a un mensaje
		RequestDispatcher rd;
		if (usuario!=null) {
			rd = request.getRequestDispatcher("templates/master.jsp");
			
			//atributo que reconoce todo
			HttpSession sesion= request.getSession();
			System.out.println("Mi sesion iniciada es: "+ sesion.getId());
			sesion.setAttribute("usuario",usuario);
			request.setAttribute("datos",usuario);

		} else {
			rd = request.getRequestDispatcher("/pages/security/login.jsp?idioma=en");
			request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
		}

		rd.forward(request, response);

	}

}
