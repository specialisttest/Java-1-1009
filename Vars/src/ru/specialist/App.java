package ru.specialist;
// import java.lang.*;

import java.util.ArrayList;

class Борщ {}

public class App {
	
	public static int a; // class field
	
	int field; // object field
	
	static boolean B1() {
		int борщ = 1;
		System.out.println("B1()");
		return false;
	}

	public static void main(String[] args) {
		{
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
		
		
		boolean a1 = true;
		boolean b1 = false;
		
		// ЛОГИЧЕСКОЕ И (AND)
		boolean c1 = a1 && b1;
		
		// ЛОГИЧЕСКОЕ ИЛИ (OR)
		c1 = a1 || b1;
		
		// ЛОГИЧЕСКОЕ НЕ (NOT)
		c1 = !a1;
		
		c1 = !(a1 && b1); // !a1 || !b1
		
		//c1 = a1 || !B1();
		//c1 = a1 | !B1();
		
		System.out.println(c1);
		
		int k1 = 5;
		c1 = (k1 / 2) == (k1 - 3);
		// ==
		// !=
		// >
		// <
		// >=
		// <=
		// [0, 100]
		c1 = (k1 >= 0) && (k1 <= 100);
		
		
		System.out.println(c1);
		}
		// scope, lifetime
		{
			int p = 10;
			System.out.println(p);
		}
		{
			String p = "abc";
			System.out.println(p);
		}
		for(int i=1; i <=10; i++)
			System.out.println(i);
		
		//System.out.println(i); // compile error
		
		//System.out.println(p); // compile error
		
		//System.out.println(борщ);
		
		// stack:  local vars, method parameters
		// heap:   object
		// static: static field
		{
			int a = 10;
			//a = a * 2;
			//int b = a *= 2;
			//int b = (a = a*2);
			//a--;
			//--a;
			
			//int b = a++ + ++a;
			//      10  +  12
			int b = ++a + a++; //bad
			//      11  + 11
			
			System.out.printf("a = %d\nb = %d\n", a, b);
		}
		
	}

}
