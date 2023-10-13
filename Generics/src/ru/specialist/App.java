package ru.specialist;

public class App {
	
	public static <T extends Comparable<? super T>> boolean isGreater(T a, T b) {
		return a.compareTo(b) > 0;
	}

	public static void main(String[] args) {
		System.out.println( isGreater(5, 3) );
		System.out.println( isGreater(5.1, 3.9) );
		System.out.println( isGreater("abc", "Abc") );
		
		
		var r1 = new ReadonlyStorage<Integer>(1);
		
		// diamond operator
		ReadonlyStorage<Double> r2 = 
				new ReadonlyStorage<>(2.5);
		
		ReadonlyStorage<String> r3 = 
				new ReadonlyStorage<String>("abc");
		//ReadonlyStorage<App> r4 = 
		//		new ReadonlyStorage<App>( new App());
		
		ReadonlyStorage<Double>[] m = 
				new ReadonlyStorage[3];
		
		// raw type
		//ReadonlyStorage r5 = new ReadonlyStorage();
		//ReadonlyStorage<Object> r5 = 
		//		new ReadonlyStorage<Object>();
		
		System.out.println(2 * r1.getData());
		System.out.println(r2.getData());
		System.out.println(r3.getData().toUpperCase());
		//System.out.println(r4.getData());

	}

}
