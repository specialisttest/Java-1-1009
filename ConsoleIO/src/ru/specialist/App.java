package ru.specialist;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
	
	public static final double PI = 3.0 + 0.1415;
	
	// psfs
	public static final String DEFAULT_COLOR = "black";
	// psfi
	public static final int MODE = 1;

	public static void main(String[] args) {
		
		//const, compiler does(!) know value
		
		final double PI2 = 2*PI;
		
		final int g = 5;
		
		System.out.printf("pi = %.8f\n", Math.PI);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ваше имя: ");
		String name = sc.nextLine();
		System.out.print("Ваш возраст: ");
		
		final int age = sc.nextInt(); // final variable, compiler doesn't know value 
		//double d = sc.nextDouble();
		
		
		// Привет, Сергей - 46!
		//System.out.print(name);
		//System.out.println(age);
		
		System.out.printf("Привет, %2$s - %1$x!\n", age, name);
		System.out.printf("Привет, %s - %-10d!\n", name, age);
		System.out.println(Math.PI);
		
		final int h = g;
		
		String s = String.format("Привет, %s - %d!", name, age);
		System.out.println(s);
		
		LocalDate now = LocalDate.now();
		
		System.out.printf("%tF\n", now); // 2023-10-09
		
		System.out.printf("%1$td.%1$tm.%1$tY\n", now); // 09.10.2023
		System.out.printf("%td.%<tm.%<tY\n", now); // 09.10.2023

	}

}
