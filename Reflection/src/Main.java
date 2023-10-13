import java.lang.reflect.*;

import static java.lang.System.out;
import java.io.*;



public class Main {

	public static void main(String[] args) 
			throws IOException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException 
	{
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		//Calculator c = new Calculator();
		//Class cInfo = c.getClass();
		
		String className = "Calculator";
		
		Class cInfo = Class.forName(className);
		
		Object c = cInfo.newInstance(); // Calculator c = new Calculator();
		
		Field[] fields = cInfo.getDeclaredFields();
		
		for(Field field : fields)
		{
			UserField an = field.getAnnotation(UserField.class);
			if(an != null && field.getType() == int.class ) {
				out.print(an.label());
				//out.printf("%s = ", field.getName());
				int n = Integer.parseInt(reader.readLine());
				field.setInt(c, n); // c.x = n
			}
		}
		
		Method[] methods = cInfo.getDeclaredMethods();
		
		for(Method method : methods)
		{
			if ( Modifier.isPublic(method.getModifiers()) )
				out.println(method.getName());
			
		}
		out.println("Select operator:");
		String action = reader.readLine();
		
		Method mForAction;
		try {
			mForAction = cInfo.getMethod(action); // add
			Object result = mForAction.invoke(c); // c.add()
			out.println(result);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
