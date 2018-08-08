package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dateday {
	public void getDateday()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(Calendar.DATE, 5);
	    System.out.println(sdf.format(calendar.getTime()));
	}
	public static void main(String[] arg) {
		Dateday x = new Dateday();
		x.getDateday();
	}

}
