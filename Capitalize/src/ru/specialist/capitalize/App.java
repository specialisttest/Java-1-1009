package ru.specialist.capitalize;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.print("Введите предложение: ");
		String s = new Scanner(System.in).nextLine();
		//String s = "hello world, sergey!"; //Hello World, Sergey!
		
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			if (word.length() > 0) {
				sb.append(Character.toUpperCase(word.charAt(0)))
				  .append(word.substring(1).toLowerCase())
				  .append(' ');
			}
		}
		
		String r = sb.toString();
		
		System.out.println(r);
		

	}

}
