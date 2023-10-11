package ru.specialist;

/*
 * Создать коллекцию имен
 * В цикле пользователь вводит имена, которые добавляются
 * в коллекцию, до тех пор пока пользователь не введет пустое имя
 * 
 * Коллекцию имен отсортировать и вывести на экран в столбик
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Имя: ");
			String name = sc.nextLine();
			
			if (name.isBlank()) break;
			
			names.add(name);
		}
	    
		Collections.sort(names);
		for(String name : names)
			System.out.println(name);
		
		

	}

}
