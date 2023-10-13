import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main 
{
	static Map<String, String> dic = new HashMap<String, String>();
	
	static final String fileName = "dictionary.bin";
	static void createDictionary() throws IOException
	{
		String eng,rus;
		BufferedReader reader = 
			new BufferedReader(
					new InputStreamReader(System.in));
		do
		{
			out.print("English word: ");
			eng = reader.readLine();
			if (!eng.isEmpty())
			{
				out.print("Russian translation: ");
				rus = reader.readLine();
				dic.put(eng, rus);
			}
		}
		while(!eng.isEmpty());
	}
	
	static void translator() throws IOException
	{
		String eng,rus;
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			out.print("Word: ");
			eng = reader.readLine();
			if (!eng.isEmpty())
			{
				if (dic.containsKey(eng))
				{
					rus = dic.get(eng);
					out.println("Translation: "+rus);
				}
				else
					out.println("Unknown word");
			}
			
		}
		while(!eng.isEmpty());
	}
	
	public static void loadDictionary() 
	{
		try
		{
			FileInputStream fis =
				new FileInputStream(fileName);
			
			ObjectInputStream ois = 
				new ObjectInputStream(fis);
			
			dic = (Map<String, String> )ois.readObject();
			
			ois.close();
		}
		catch(IOException | ClassNotFoundException ex)
		{
			dic = new HashMap<String, String>();
			
		}
		
		
	}
	public static void saveDictionary() throws IOException
	{
		FileOutputStream fos = 
			new FileOutputStream(fileName);
		
		ObjectOutputStream oos = 
			new ObjectOutputStream(fos);
		
		oos.writeObject(dic);
		
		oos.close();
		fos.close();
		
	}
	
	public static void main(String[] args) 
		throws IOException, ClassNotFoundException
	{
		
		out.println("Translator");
		
		loadDictionary();
		out.println("Dictionary creation");
		createDictionary();
		saveDictionary();
		out.println("Translation");
		translator();
		
	}

}
