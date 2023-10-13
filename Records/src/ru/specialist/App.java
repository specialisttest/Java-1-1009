package ru.specialist;

public class App {

	public static void main(String[] args) {
		PersonOld p1 = new PersonOld("Sergey", 30);
		System.out.println(p1);
		
		Person p2 = new Person("Sergey", 30);
		System.out.println(p2);
	}

}
