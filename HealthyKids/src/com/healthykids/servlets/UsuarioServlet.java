package com.healthykids.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthykids.beans.PerfilDTO;
import com.healthykids.beans.UsuarioDTO;
import com.healthykids.services.UsuarioService;

	

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
			switch (carga) {
			case "cargarListar": cargarListar(request, response); break;
			case "cargarInsertar": cargarInsertar(request, response); break;
			case "cargarActualizar": cargarActualizar(request, response); break;
			}
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
	private void cargarListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("cargarListar - inicio");
		request.getRequestDispatcher("pages/maintenances/Usuarios/usuarioListar.jsp").forward (request, response);
		System.out.println("cargarListar - fin");
	}
	private void cargarInsertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("cargarInsertar - inicio");
		request.getRequestDispatcher("pages/maintenances/Usuarios/usuarioInsertar.jsp").forward (request, response);
		System.out.println("cargarInsertar - fin");
	}
	private void cargarActualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("cargarActualizar - inicio");
		request.getRequestDispatcher("pages/maintenances/Usuarios/usuarioActualizar.jsp").forward (request, response);
		System.out.println("cargarActualizar - fin");
	}
	
	//Metodos para Acciones Basicas
	private void listar(HttpServletRequest request, HttpServletResponse response){
		System.out.println("listar - inicio");
		UsuarioService servicioUsuario = new UsuarioService();
		List<UsuarioDTO> listUsuario; 
		UsuarioDTO usuario;
		try {
			int cboBusqueda = Integer.parseInt(request.getParameter("cboBusqueda"));
			String txtBusqueda = request.getParameter("txtBusqueda");
			usuario = new UsuarioDTO();
			usuario.setEstado("A");
			
			switch (cboBusqueda) {
				case 0: usuario.setNombre(txtBusqueda);break;
				case 1: usuario.setApellido(txtBusqueda);break;
				case 2: usuario.setUsuario(txtBusqueda);break;
			}
			
			listUsuario = servicioUsuario.listar(usuario);
			request.setAttribute("listUsuario", listUsuario);
			//request.getSession().setAttribute("carro", listUsuario);
			request.getRequestDispatcher("pages/maintenances/Usuarios/usuarioListar.jsp").forward (request, response);
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage().toString());
		}
		System.out.println("listar - fin");
	}
	private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("insertar - inicio");
		UsuarioService servicioUsuario = new UsuarioService();
		UsuarioDTO user;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			String nombre = request.getParameter("txtnombre");
			String apellido = request.getParameter("txtapellido");
			Date fechaNacimiento = formatter.parse(request.getParameter("txtfechanacimiento"));
			String usuario = request.getParameter("txtusuario");
			String clave = request.getParameter("txtclave");
			int telefono = Integer.parseInt(request.getParameter("txttelefono"));
			String email = request.getParameter("txtcorreo");
			
			user = new UsuarioDTO(null, nombre, apellido, fechaNacimiento, new Date(), null, usuario, clave, telefono, email, "A");
			servicioUsuario.insertar(user);
			
		} catch (Exception e) {
			System.out.println("Error en UsuarioServlet - insertar");
		}
		request.getRequestDispatcher("pages/maintenances/Usuarios/usuarioListar.jsp").forward (request, response);
		System.out.println("insertar - fin");
	}
	private void actualizar(HttpServletRequest request, HttpServletResponse response){
		System.out.println("actualizar - inicio");
		
		System.out.println("actualizar - fin");
	}
	
	//Obtener y Establecer
	
}
