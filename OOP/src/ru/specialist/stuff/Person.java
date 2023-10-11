package ru.specialist.stuff;

public class Person {
	
	public static final int DEFAULT_AGE = 21;
	
	// object field
	public String name = "Незнакомец";
	public int age;
	
	// class field
	public static int counter = 0;
	
	/*{
		this.age = 18;
	}*/
	
	static {
		System.out.println("2");
	}
	
	public static void showTotal() {
		System.out.printf("Total person: %d\n",
				Person.counter);
	}
	
	public Person() {
		this("Unknown");
	}
	
	public Person(String name) {
		this(name, DEFAULT_AGE);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		//Person.counter++;
		counter++;
	}
	
	public void show() {
		System.out.printf("%s - %d\n", name, this.age);
	}

}
