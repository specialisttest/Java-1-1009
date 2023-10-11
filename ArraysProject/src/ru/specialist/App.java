package ru.specialist;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		//int[] m = new int[3];
		//m[0] = 100;
		//m[1] = 200;
		
		//int[] m = new int[] {100, 200, 0};
		
		int[] m = {100, 200, 0};
		
		System.out.println(m.length);
		for(int i=0; i < m.length; i++)
			System.out.println(m[i]);
		
		String[] names = {"Александр", "Станислав", "Андрей"};
				//new String[] 
		//System.out.println(names[0].toUpperCase());
		Arrays.sort(names);
		
		for(int i=0; i < names.length; i++)
			System.out.println(names[i]);
		
		// 1 2 3
		// 4 5 6
		int[][] matrix = {
				{1,2,3},
				{4,5}
		};
		System.out.println(matrix.length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%3d", matrix[i][j]);
			System.out.println();
		}
		
		int[] m1 = {10};
		int[] m2 = m1.clone(); // m2 = m1;
		System.out.println(m1[0]);
		System.out.println(m2[0]);

		m1[0]++;
		
		System.out.println(m1[0]);
		System.out.println(m2[0]);
		
		
		

	}

}
