import static java.lang.System.out;

public class Program {
	
	public static void test(String s1, String s2) throws MyException
	{
		try {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 < 0 || n1 > 100)
				//throw new IllegalArgumentException("n1 out of [0, 100]");
				throw new MyException("n1 out of [0, 100]", n1);
			
			int n = n1 / n2;
			
			System.out.println( n );
			
		}
		/*catch(MyException ex) {
			System.out.printf("%s Invalid data: %d\n",
					ex.getMessage(), ex.getInvalidData());
		}*/
		catch(NumberFormatException ex) {
			System.out.println("Not a number");
		}
		catch(IllegalArgumentException ex) {
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
			//throw new RuntimeException("Error", ex);
		}
		finally {
			System.out.println("finally");
			//return; // bad (exception lost)
		}
		
		/*catch(NumberFormatException | ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}*/
		
		System.out.println("continue test()");
	}
	
	public static void main(String[] args) 
	{
		try {
			test("23", "10");
		}
		catch(MyException ex) {
			System.out.printf("%s Invalid data: %d\n",
					ex.getMessage(), ex.getInvalidData());
		}
		/*catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}*/
		System.out.println("continue main()");
	}

}
