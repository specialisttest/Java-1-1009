package ru.specialist;

public class Program {

	public static void main(String[] args) {
		for(int x=1; x <= 1024; x++) {
			//  0000..1...000
			//  0000..0111111
			
			//  00..1.00.1..0
			//  00..1.00.0111
			
			//if ( (x & (x-1)) == 0)
			if ( (x & -x) == x )
				System.out.println(x);
			
			
		}

	}

}
