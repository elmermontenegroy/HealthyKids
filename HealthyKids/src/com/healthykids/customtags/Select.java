package com.healthykids.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Select extends TagSupport{

	//Variables
	private String nombre;
	
	//Metodos CustomTags
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			switch (nombre) {
				case "manUsuBuscar": manUsuBuscar(out); break;
			}
		} catch (IOException e) {
			throw new JspException("Error: " + e.getMessage());
		}
		return SKIP_BODY;
	}
	public int doEndTag() throws JspException {
		// acciones al finalizar la etiqueta
		return EVAL_PAGE;
	}

	//Mantenimiento de Usuarios
	private void manUsuBuscar(JspWriter out) throws IOException{
		out.println("<select>");
		out.println("<option value='0' selected >Nombre</option>");
		out.println("<option value='1'>Apellido</option>");
		out.println("<option value='2'>Usuario</option>");
		out.println("<option value='3'>Estado</option>");
		out.println("<select>");
	}
	
	//Mantenimiento de Perfiles
	
	
	//Obtener y Establecer
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
