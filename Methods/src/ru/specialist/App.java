package ru.specialist;

public class App {
	
	static double average(int a, int b) {
		double avg = (a + b) / 2d;
		return avg;
	}
	
	static double average(int... m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
	}
	
	
	// overloading - перегрузка методов
	
	static void sayHello() {
		sayHello("Незнакомец");
	}
	static void sayHello(int age) {
		System.out.printf("Привет, %d!\n", age);
	}
	static void sayHello(String name) {
		System.out.printf("Привет, %s!\n", name);
	}
	
	static void sayHello(String name, int age) {
		System.out.printf("Привет, %s - %d!\n", name, age);
		//System.out.printf("Привет, %s - %d!\n", new Object[] {name,age});
		//return;
	}

	public static void main(String[] args) {
		//App app = new App();
		//app.sayHello(); // non-static call
		App.sayHello("Елена"); // static call
		sayHello("Анна", 27);
		sayHello(33);
		sayHello(); // sayHello("Незнакомец");
		
		double x = average(10, 11);
		
		System.out.println(x);
		System.out.println( average(10, 11) );
		
		System.out.println( average(new int [] {10,11,12,13}) );
		System.out.println( average(10,11,12,13,14) );
		System.out.println( average(10,11,12,13,14,15) );
		
	}

}
