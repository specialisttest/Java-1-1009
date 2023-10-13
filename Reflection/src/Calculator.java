
public class Calculator {
	
	@UserField(label = "Enter x:")
	public int x;
	@UserField(label = "Enter y:")
	public int y;
	
	public int z;
	
	public int add()
	{
		
		return x+y;
	}
	
	
	public int multi()
	{
		return x*y;
	}
	
	
	public int minus()
	{
		return x-y;
	}
	
	public int divide()
	{
		return x/y;
	}


}
