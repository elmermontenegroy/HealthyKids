package com.healthykids.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaUtils {
	//Clase para manejar las Fechas
	//Date today = Calendar.getInstance().getTime();      
	
	public static String dateToStringShort(Date date){
		DateFormat dfshort = new SimpleDateFormat("dd/MM/yyyy");
		return dfshort.format(date);
	}
	public static String dateToStringLong(Date date){
		DateFormat dflong = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return dflong.format(date);
	}

}
