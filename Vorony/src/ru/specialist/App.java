package ru.specialist;

import java.util.Scanner;

/*
 * I.
 *  Пользователь вводит цело число (ворон на ветке) в 
 *  диапазоне от 0 до 9
 *  Вывести сообщение: На ветке 5 ворон
 *  С правильным падежом слова "ворона"
 * II.
 *  Тоже самое для любых положительных целых чисел
 * 
 * 
 */


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Сколько ворон на ветке: ");
		int n = sc.nextInt();
		int n2 = n % 100;
		String v;
		if (n2 >= 11 && n2 <= 14)
			v = "ворон";
		else
			v = switch( n % 10 ) {
				case 1 -> "ворона";
				case 2,3,4 -> "вороны"; // since java 14
				default -> "ворон";
			};
		
		System.out.printf("На ветке %d %s\n", n, v);
		

	}

}
