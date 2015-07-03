package com.healthykids.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaUtils {
	//Clase para manejar las Fechas
	
	public static String dateToStringFormato(Date date, String formato){
		DateFormat dfshort = new SimpleDateFormat(formato);
		return dfshort.format(date);
	}
	
	public static String dateToStringShort(Date date){
		DateFormat dfshort = new SimpleDateFormat("yyyy/MM/dd");
		return dfshort.format(date);
	}
	
	public static String dateToStringLong(Date date){
		DateFormat dflong = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dflong.format(date);
	}

	public static Date stringToDateFormato(String date, String formato) throws ParseException{
		DateFormat dfshort = new SimpleDateFormat(formato);
		return dfshort.parse(date);
	}
	
	public static Date stringToDateShort(String date) throws ParseException{
		DateFormat dfshort = new SimpleDateFormat("yyyy/MM/dd");
		return dfshort.parse(date);
	}

	public static Date stringToDateLong(String date) throws ParseException{
		DateFormat dflong = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dflong.parse(date);
	}

}
