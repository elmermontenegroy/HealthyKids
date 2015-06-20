package com.healthykids.utils;

import java.util.List;

import com.healthykids.controls.Select;

public class ControlUtils {
	//Clase para generar Contenido html
	
	public static String fillSelect(List<Select> lista){
		String html="[";
		for(Select s : lista){
			html+="{\"value\":\""+s.getValue()+"\", \"label\":\""+s.getLabel()+"\", \"selected\":\""+s.getSelected()+"\"},";
		}
		html=html.substring(0, html.length()-1)+"]";
		System.out.println(html);
		return html;	
	}
		
}
