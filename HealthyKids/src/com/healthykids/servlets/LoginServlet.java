package com.healthykids.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String usuario = request.getParameter("txtUsuario"); // txtUsuario.getText()
		String clave = request.getParameter("txtClave");

		// -- Busca el usuario y clave en la BD
/*		UsuarioService servicio = new UsuarioService();
		UsuarioDTO validado = servicio.validarUsuario(usuario, clave);
*/
		// -- nos envia a la pagina bienvenido.jps junto a un mensaje
		RequestDispatcher rd;
		if (usuario.equals("admin") && clave.equals("1234")) {//validado != null
			rd = request.getRequestDispatcher("/welcome.jsp");
			
/*			//atributo que reconoce todo
			HttpSession misesion= request.getSession();
			System.out.println("mi sesion iniciada es "+ misesion.getId());
			misesion.setAttribute("datosconsesion",
					validado.getNombre() + " " + validado.getApellido());
			
			request.setAttribute("datos",
					validado.getNombre() + " " + validado.getApellido());*/
			

		} else {
			rd = request.getRequestDispatcher("/login.jsp"); // pag o servlet
			request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
		}

		rd.forward(request, response);

	}

}
