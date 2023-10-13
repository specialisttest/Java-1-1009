package ru.specialist.stuff;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Serializable, Comparable<Person>
{
	
	public static final Comparator<Person> byName = 
			(x1, x2) -> x1.getName().compareTo(x2.getName());
	
	public static final Comparator<Person> byAge = 
			(x1, x2) -> x1.getAge() -x2.getAge();
			
	public static final int DEFAULT_AGE = 21;
	
	// object field
	private String name = "Незнакомец";
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	@Override
	public int compareTo(Person p) {
		// if (this > p) return 1;
		// if (this < p) return -1;
		// if (this == p) return 0;
		//return this.getName().compareTo(p.getName());
		//return  this.getAge() - p.getAge();
		int k = p.getAge() - this.getAge();
		return (k == 0) ? this.getName().compareTo(p.getName()) : k;
	}

}
