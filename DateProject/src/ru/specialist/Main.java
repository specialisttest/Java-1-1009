package ru.specialist;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;

import java.time.*;
import static java.lang.System.out;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date now = new Date();
		
		//now.getTime()
		
		out.println(now.toLocaleString());
		
		out.println(now.getYear()+1900);
		out.println(now.getDate());
		out.println(now.getDay());
		
		out.println(now.getTimezoneOffset());
		now.setMinutes(now.getMinutes()+now.getTimezoneOffset());
		out.println(now);
		
		
		
		Calendar sys = Calendar.getInstance();
		
		Calendar rus = Calendar.getInstance(new Locale("ru"));
		
		out.println(rus.get(Calendar.YEAR));
		out.println(rus.get(Calendar.MONTH));
		out.println(rus);
		
		
		out.printf("%1$tY %1$tB %1$td\n", rus);
		
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT,
						new Locale("ru"));
		String result =  f.format(rus.getTime());
		out.println(result);
		
		
		
		/*DateFormat fInput = 
				DateFormat.getDateInstance(DateFormat.SHORT, 
						new Locale("ru")); 
		
		Scanner sc = new Scanner(System.in);
		out.print("¬ведите дату: ");
		
		try 
		{
			Date d = fInput.parse(sc.nextLine());
			out.println(d.toLocaleString());
		} 
		catch (ParseException e) 
		{
			out.println(e.getMessage());
		}*/
		
		// since Java 8
		Clock c = Clock.systemDefaultZone();
		out.println(c.instant());
				
		
		LocalTime lt = LocalTime.now();
		out.printf("%tT\n", lt);
		
		LocalDate ld = LocalDate.now();
		out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		
		out.println(ldt);
		out.println(ldt.withYear(2015));
		out.println(ldt);
		out.println(c.instant());
				

	}

}
