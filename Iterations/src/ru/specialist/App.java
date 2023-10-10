package ru.specialist;

public class App {

	public static void main(String[] args) {
		//for(int i=100; i > 0; i -= 3)
		//	System.out.println(i);
		
		for(int i=1; i <= 10; i++) {
			if (i == 8) break;
			if (i == 4) continue;
			System.out.println(i);
		}
		
		// 1 2 3 4 .. 10
		// 2 4 6 8 .. 20
		// ..
		// 10 20      100
		
		
	abc:	
		for(int i=1; i <= 10; i++) {
			for(int j=1; j <= 10; j++) {
				if (j == 5) break abc;
				System.out.printf("%4d", i*j);
			}
			System.out.println();
			
		}
		// for(;;); //infinite iterations
		
		System.out.println("\ncontinue");
		
		int k = 2000;
		//for(;k < 1000;) {
		while (k < 1000) {
			System.out.println(k);
			k *= 2; // k = k * 2;
		}
		
		k = 2000;
		do {
			System.out.println(k);
			k *= 2;
		} while (k < 1000);
		
		

	}

}
