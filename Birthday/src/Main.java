import java.util.*;
import java.io.*;
import java.text.*;

import static java.lang.System.out;

public class Main {
	
	public static void main(String[] args) throws ParseException, IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
			);
		Locale rLocale = new Locale("ru", "ru");
		Calendar now = 
			Calendar.getInstance(rLocale);
		
		Calendar birthCurrent = 
			Calendar.getInstance(rLocale);
		
		DateFormat f = DateFormat.getDateInstance(
				DateFormat.SHORT, rLocale);
		f.setCalendar(birthCurrent);
		
		out.print("Введите дату рождения: ");
		f.parse(reader.readLine());
		
		int birthYear = birthCurrent.get(Calendar.YEAR);
		
		birthCurrent.set(Calendar.YEAR, 
				now.get(Calendar.YEAR));
		
		
		int age = birthCurrent.get(Calendar.YEAR)-birthYear;
		
		if (birthCurrent.after(now))
			age--;
		
		out.printf("Полное число лет: %d\n", age);
		
		
	}
}
