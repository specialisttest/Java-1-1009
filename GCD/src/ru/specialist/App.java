package ru.specialist;
/*
 * I.
 * Сделать метод gcd с 2 параметрами 
 * типа int и возвращаемым значением int
 * gcd(35, 14) = 7
 * gcd(1071, 462) = 21
 * Алгоритм Евклида:
 * k1 > k2
 * k1 % k2 = k3 (если k3 ==0 то ответ k2)
 * k2 % k3 = k4 (если k4 ==0 то ответ k3)
 *  
 * 
 * II.
 * gcd(int...)
 * 
 * 
 * 
 */

public class App {
	
	public static int gcd(int k1, int k2) {
		int k3;
		while ( (k3 = k1 % k2) != 0) {
			k1 = k2;
			k2 = k3;
		}
		return k2;
	}
	
	public static int gcd(int... m) {
		if (m == null || m.length == 0) return 0;
		if (m.length == 1) return m[0];
		
		int result = gcd(m[0], m[1]);
		for(int i=2; i < m.length; i++)
			result = gcd(m[i], result);
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println( gcd(1071, 462) );
		System.out.println( gcd(462, 1071) );
		System.out.println( gcd(462, 42, 1071) );
		System.out.println( gcd(35, 63, 14) );
		System.out.println( gcd( new int[] {35, 63, 14}) );

	}

}
