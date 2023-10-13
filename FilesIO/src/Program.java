import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;
import java.time.LocalDateTime;
import static java.lang.System.out;

public class Program
{

	public static final String fileName1= // ../test1.txt
			".."+File.separator+"test1.txt";
	
	
	public static final String fileName2=
			".."+File.separator+"test2.txt"; // ..\test2.txt
	
	public static final String dir1=".."+File.separator; // ..\
	
	public static void main(String[] args)
			throws IOException
	{
		//out.println(File.separator);
		File f1 = new File(fileName1); // 
		//new File(".");
		
		if (!f1.exists())
			f1.createNewFile();
		
		Date lm = new Date(f1.lastModified());
		//LocalDateTime.
		out.println(lm.toLocaleString());
		out.println(f1.getCanonicalPath());
		
		
		File d1 = new File(dir1); // ..\
		out.println(d1.getCanonicalPath());
		
		File[] files = d1.listFiles();
		
		for(File file : files)
		{
			Date l = new Date(file.lastModified());
			
			if (file.isDirectory())
				out.printf("%-20s %2$tH:%2$tM:%2$tS\n", 
						file.getName().toUpperCase(), l);
			
			if (file.isFile())
				out.printf("%-20s %2$tH:%2$tM:%2$tS\n", 
						file.getName().toLowerCase(), l);
		}
		
		
		
		//FileInputStream fs = new FileInputStream(fileName1);
		//byte[] buf = new byte[1000];
		//fs.read(buf);
		//fs.close();
		
		
		
		try(FileInputStream fs = new FileInputStream(fileName1);
				BufferedReader reader = new BufferedReader(
				new InputStreamReader(fs, Charset.forName("cp1251"))))
		{
			String line = null;
			int lineCounter = 0;
			int charCounter = 0;
			int wordCounter = 0;
			
			while ( (line = reader.readLine()) != null)
			{
				out.println(line);
				lineCounter++;
				charCounter += line.length();
				wordCounter += line.split("\\s").length;
			}
			out.println("-----------------------------------");
			out.printf("Total lines: %d, words: %d, chars: %d\n",
				lineCounter, wordCounter, charCounter);
		}
		
		//reader.close();
		//fs.close();
		
		
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream(fileName2);
			
			PrintWriter writer = new PrintWriter(fos);
			
			writer.printf("%-15s - %d\r\n", "Abc", 35);
			writer.flush();
			writer.printf("%-15s - %d\r\n", "Cde", 30);
			writer.printf("%-15s - %d\r\n", "Efg", 7);
			
			writer.close();
		}
		catch(IOException ex)
		{
			out.println(ex.getMessage());
			
		}
		finally
		{
			if (fos != null)
				fos.close();
		}
		
		
		
		try(RandomAccessFile rnd = 
				new RandomAccessFile(fileName2, "rw"))
		{
			rnd.seek(0);
			//rnd.seek(rnd.length())
			//rnd.write
			//rnd.read
			out.println(rnd.length());
		}//rnd.close();
				
		
		

	}

}
