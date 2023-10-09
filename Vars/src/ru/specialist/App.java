package ru.specialist;
// import java.lang.*;

import java.util.ArrayList;

class Борщ {}

public class App {
	
	static int a;

	public static void main(String[] args) {
		//Борщ борщ = new Борщ();
		var борщ = new Борщ();
		
		
		int userCounter; // camel notation
		String s1 = null;
		byte b = 100;
		
		int x = 100;
		
		char ch = 123;
		
		var h = 100; //int h = 100;
		
		var name = "name"; //String name = "Sergey";
		
		userCounter = 123;
		System.out.println( userCounter );
		userCounter = 256;
		System.out.println( userCounter );		
		System.out.println( a );
		
		// byte, short, int, long
		int q = 040;
		// + - * / %
		q = 7 % 3;
		int r = (q + 5) * 2;
		
		//long t = r; // implicit conv
		//r = (int)t; // explicit conv
		
		long t = Integer.MAX_VALUE + 1L;
		
		System.out.println( t );
		r = (int)t;
		System.out.println( r );
		
		// + - * /
		double d = 2D; // 2.0
		double e = 2e7; // 20000000
		float f = 1.5F;
		
		int y = 5;
		
		double z = y / 2D;
		
		System.out.println(d);
		System.out.println(z);
		
		//ArrayList<ArrayList<Integer>> list = 
		//		new ArrayList<ArrayList<Integer>>();
		var list = new ArrayList<ArrayList<Integer>>();
		
		final int k;
		k = 50;
		
		//k = k*2;
		
		

	}

}
