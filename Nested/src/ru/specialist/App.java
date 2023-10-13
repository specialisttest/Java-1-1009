package ru.specialist;

public class App {

	public static void main(String[] args) {
		Outer.Nested n = new Outer.Nested();
		Outer o = new Outer(10);
		n.increment(o);
		
		Outer.Inner i = o.new Inner();
		i.increment();
		System.out.println(o.getData());

	}

}
