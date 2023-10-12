package ru.specialist;

public class Singleton {
	
	private Singleton() {}
	
	private static volatile Singleton instance = null;
	
	public synchronized static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		
		return instance;
	}

}
