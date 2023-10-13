package ru.specialist;

public class Outer {
	
	// Outer.Nested
	// public,private,protected, (package) 
	// break incapsulation
	public static class Nested {
		
		public void increment(Outer o) {
			o.data++;
		}
	}
	
	// Outer.Nested
	// public,private,protected, (package) 
	// break incapsulation
	// Каждый объект Inner класса "прикреплен"
	// к какому то объекту Outer класса
	public class Inner{
		private int data = 5;
		
		public void increment() {
			data++; // Inner.data
			//Inner.this.data++;
			Outer.this.data++; // Outer.data
		}
	}	
	
	private int data;
	public int getData() {
		// new Inner(); // this.new Inner()
		return data;
	}
	
	public Comparable<Integer> getMyComparator() {
		// Local class (like Inner)
		//  scope - method, no modifiers
		//  closure
		int k = -1; // effective finalized 
		/*class MyComparator implements Comparable<Integer> {
			public int compareTo(Integer z) {
				return k*(data - z);
			}
		}
		MyComparator cmp = new MyComparator();*/
		
		Comparable<Integer> cmp = new Comparable<Integer>() {
			private int abc;
			{
				abc = k;
				
			}
			public int compareTo(Integer z) {
				return k*(data - z);
			}
		};
		
		return cmp;
		
	}
	
	public boolean isGreater(int x) {
		
		Comparable<Integer> cmp = getMyComparator();
		
		return cmp.compareTo(x) > 0;
		
		
		//return data > x;
	}

	public Outer(int data) {
		this.data = data;
	}
	

}
