package ru.specialist;

public class App {

	public static void main(String[] args) {
		int n = -10;
		if (n > 0) {
			System.out.println("n больше 0");
			System.out.println("n > 0");
		}
		else
			if (n > - 100)
				System.out.println("n > -100");
			else
				System.out.println("n НЕ больше 0");
		
		int a = 0;
		/*String s;
		if (a == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		String s =  (a == 0) ? "ноль" : "не ноль";
		System.out.println(s);
		
		String name = null;
		
		// System.out.println( name.toUpperCase() ); // NPE
		
		/*if (name != null)
			System.out.println( name.toUpperCase() );
		else
			System.out.println( "<EMPTY>" );*/
		
		System.out.println( name!=null ? name.toUpperCase() : "<EMPTY>" );
		
		n = 2;
		final int ONE = 1; // = n/2;
		/*switch(n) {
			case -1,1 : 
				System.out.println("один");
				break;
			case 2*ONE : 
				System.out.println("два");
				break;
			case 3 : 
				System.out.println("три");
				break;
			default :
				System.out.println("много");
		}*/
		
		/*String result;
		switch(n) {
			case -1,1 	-> result = "один";
			case 2*ONE 	-> result = "два";
			case 3 		-> result = "три";
			default 	-> {
				n = Integer.MAX_VALUE;
				result = "много";
				
			}
		}*/
		String result = 
			switch(n) {
				case -1,1 	-> "один";
				case 2*ONE 	-> "два";
				case 3 		-> "три";
				default 	-> {
					n = Integer.MAX_VALUE;
					yield "много";
				}
			};
		
		System.out.println(result);
		

	}

}
