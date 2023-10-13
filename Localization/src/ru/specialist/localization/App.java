package ru.specialist.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class App {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.GERMAN);
		ResourceBundle labels =
				ResourceBundle.getBundle("ru.specialist.localization.text",
						Locale.getDefault());
		String hello = labels.getString("hello");
		System.out.println(hello);
		
		ResourceBundle labelsRU =
				ResourceBundle.getBundle("ru.specialist.localization.text",
						//new Locale("RU")
						Locale.getDefault()
						);
				
		String helloRU = labelsRU.getString("userName");
		System.out.println(helloRU);
		
	}

}
