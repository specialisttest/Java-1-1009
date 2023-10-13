package ru.specialist;

import java.util.*;
import java.io.*;

class Person implements Serializable
//, Externalizable
{
	private String name;
	private /*transient*/ int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("%s - %d", getName(), getAge());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Person p = (Person)o;
		return this.name.equals(p.name) &&
				this.age == p.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}
}

public class App {
	
	public static void savePersons(Set<Person> p) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("person.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
	}
	
	
	
	
	public static Set<Person> loadPersons()  throws IOException, 
		ClassNotFoundException
	{
		
		FileInputStream fis = new FileInputStream("person.bin");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Set<Person> p = (Set<Person>)ois.readObject();
		
		ois.close();
		fis.close();
		
		return p;
	}
	
	public static boolean testString(String s)
	{
		System.out.printf("%s : ",s);
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == '(' || ch=='[')
				st.push(ch);
			if (ch == ')' || ch==']')
			{
				if (st.size() == 0) return false;
				char p = st.pop();
				if ( !((p=='(' && ch==')') || (p=='[' && ch==']')) )
					return false;
			}
		}
		
		return st.size() == 0;
		
	}
	

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		List<String> names = new LinkedList<String>();
		System.out.println(names.size());
		names.add("Сергей");
		names.add("Даша");
		names.add("Анна");
		names.add("Константин");
		//List<String> names = List.of("Сергей", "Даша", "Анна", "Константин");
		//var names = List.of("Сергей", "Даша", "Анна", "Константин");
		
		//names.remove(1);
		//names.set(1, "Елена");
		
		System.out.println(names.size());
		
		// bad
		//for(int i=0; i < names.size(); i++)
		//	System.out.println(names.get(i));
		
		/*Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}*/
		
		/*
		 * простой  Обёртки
		 *   тип     (java.lang)
		 * double 	Double
		 * long		Long
		 * int		Integer
		 * char		Character
		 * 
		 * 
		 * 
		 */
		
		int k = 10;
		Integer ko = k; // new Integer(k) // boxing
		int k2 = ko; //unboxing
		
		//List<Integer> m = new ArrayList<Integer>();
		//m.add(10);
		//m.add(20);
		List<Integer> m = List.of(10, 20); // unmodified collection
		
		Collections.sort(names);
		for(String name : names)
			System.out.println(name);
		
		//System.out.println(
		//		testString("([sdaf])adsfjk(s)d[()as()](sdf)"));
		
		Map<String, Integer> persons = 
				new HashMap<String, Integer>();
		
		persons.put("Сергей", 40);
		persons.put("Андрей", 40);
		persons.put("Костя", 15);
		persons.put("Саша", 12);
		persons.put("Костя", 16);
		
		for(Map.Entry<String, Integer> p :  persons.entrySet())
			System.out.printf("%s - %d\n", p.getKey(), p.getValue());	
		
		
		System.out.println(persons.size());
		
		String name = "Костя";
		if (persons.containsKey(name))
		{
			int age = persons.get(name);
			System.out.printf("%s - %d\n", name, age);
		}
		
		
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("Сергей", 40));
		set.add(new Person("Костя", 15));
		set.add(new Person("Саша", 11));
		set.add(new Person("Саша", 11));
		
		System.out.println(set.size());
		
		
		System.out.println("Set of persons");
		for(Person p : set)
			System.out.println(p);
		
		Person p1 = new Person("Саша", 11);
		Person p2 = new Person("Саша", 11);
		System.out.println( p1.hashCode() );
		System.out.println( p2.hashCode() );
		//System.out.println( p1.equals(p2) );
		
		
		savePersons(set);
		set = null;
		
		set = loadPersons();
		
		System.out.println("Set of persons (from file)");
		for(Person p : set)
			System.out.println(p);
		
		

	}

}
