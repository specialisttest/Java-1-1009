package ru.specialist.stuff;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{
	
	public static final int DEFAULT_AGE = 21;
	
	// object field
	public String name = "Незнакомец";
	
	//private int age;
	private int birthYear; 
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}

	public void setAge(int age) {
		if (age >=0 && age <=120)
			this.birthYear = LocalDate.now().getYear() - age;
		else
			throw new IllegalArgumentException("age out of [0, 120]");
	}

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
		//this.age = age;
		setAge(age);
		//Person.counter++;
		counter++;
	}
	
	public void show() {
		System.out.printf("%s - %d\n", name, this.getAge());
	}

}
