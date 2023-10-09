package ru.specialist;

import java.util.Scanner;
import java.util.Locale;

/*
 *	Ввести вещественное число (температура в градусах цельсия) 
 *  Перевести температуру в градусы Фаренгейта по формуле:
 *    tf = tc * 9 / 5 + 32
 *  Вывести температуру в градусах Фаренгейта с 3 знаками после запятой
 *  Проверить, какой разделитель целой и дробный части используется 
 *  при ввод и выводе по умолчани.  
 * 
 */


public class App {
	
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Locale.setDefault(new Locale("ru", "ru"));
		
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.US)
		System.out.print("Температура (С): ");
		double tc = sc.nextDouble();
		
		double tf = tc * 9d / 5d  + 32d;
		
		//System.out.printf(Locale.US, "Температура (F): %.3f\n", tf);
		System.out.printf("Температура (F): %.3f\n", tf);
		
	}

}
