package ru.specialist;

/*
 * Вывести числа Фибоначчи < 1000
 * 1 1 2 3 5 8 13 ...
 * 
 */

public class App {

	public static void main(String[] args) {
		int k1 = 0, k2 = 1;
		System.out.println(k1);
		System.out.println(k2);
		int k3;
		
		while ( (k3 = k1 + k2) < 1000 ) {
			System.out.println(k3);
			k1 = k2;
			k2 = k3;
		}
			
		

	}

}
