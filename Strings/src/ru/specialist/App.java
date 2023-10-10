package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//String s1 = new String("abc");
		String s = "a\\b\"c\nd\tefgh\u002F";
		String name = "Сергей";
		String r = "Привет, " + name + "!";
		//String r = String.format("Привет, %s!", name);
		
		/*
		 * "Сергей"
		 * "Привет, "
		 * "!"
		 * "Привет, Сергей"
		 * "Привет, Сергей!"
		 * 
		 */
		
		System.out.println(s);
		System.out.println(r);
		System.out.println( r.length() );
		System.out.println( r.charAt(0) );
		System.out.println( r.charAt(r.length()-1) );
		System.out.println( r.contains("Сергей") );
		System.out.println( r.contains("Андрей") );
		System.out.println( r.indexOf("Сергей") );
		System.out.println( r.isBlank() );
		System.out.println( r.replace("Сергей", "Андрей"));
		System.out.println( r );
		System.out.println( r = r.toUpperCase() );
		System.out.println( r );
		System.out.println( r.trim() );
		//String phone = "232-56-78"; // xxx-xx-xx
		//System.out.println ( phone.matches("\\d\\d\\d-\\d\\d-\\d\\d") );
		
		String s1 = "abc";
		String sa = "ab";
		String s2 = sa+"c"; 
			//new Scanner(System.in).nextLine();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); // сравнение ссылок !!!
		
		//  1 2 3 4 .. 100
		// 302 строки
		// ""
		// " "
		// "1"
		// "1 "
		// "1 2"
		// BAD, Very BAD
		//String result = "";
		//for(int i = 1; i <= 100; i++)
		//	result = result + String.valueOf(i) + " ";
		StringBuilder sb = new StringBuilder(); // ""
		for(int i = 1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String result = sb.toString();
		//StringBuilder sb1 = new StringBuilder(result);
		
		System.out.println( result );
		
	}

}
