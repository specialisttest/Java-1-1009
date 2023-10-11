package ru.specialist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		System.out.println(names.size());
		names.add("Сергей");
		names.add("Даша");
		names.add("Анна");
		names.add("Константин");
		//List<String> names = List.of("Сергей", "Даша", "Анна", "Константин");
		//var names = List.of("Сергей", "Даша", "Анна", "Константин");
		
		//names.remove(1);
		//names.set(1, "Елена");
		
		System.out.println(names.size());
		
		// bad
		//for(int i=0; i < names.size(); i++)
		//	System.out.println(names.get(i));
		
		/*Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}*/
		
		/*
		 * простой  Обёртки
		 *   тип     (java.lang)
		 * double 	Double
		 * long		Long
		 * int		Integer
		 * char		Character
		 * 
		 * 
		 * 
		 */
		
		int k = 10;
		Integer ko = k; // new Integer(k) // boxing
		int k2 = ko; //unboxing
		
		//List<Integer> m = new ArrayList<Integer>();
		//m.add(10);
		//m.add(20);
		List<Integer> m = List.of(10, 20); // unmodified collection
		
		Collections.sort(names);
		for(String name : names)
			System.out.println(name);
		

	}

}
