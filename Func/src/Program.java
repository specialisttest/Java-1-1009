import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("������", 40));
		persons.add(new Person("����", 7));
		persons.add(new Person("�����", 11));
		persons.add(new Person("�������", 35));
		
		//for(Person p : persons)
		//	out.println(p);
		//persons.stream().forEach(out::println);
		
		/*
		for(Person p : persons)
			if (p.age >= 18)
				out.println(p);
		
		persons.stream().
			filter(p->p.age>=18).
			forEach(out::println);*/
		
		/*ArrayList<Person> result = new ArrayList<>();
		for(Person p : persons)
			if (p.age >=18)
				result.add(p);
		
		Collections.sort(result, (p1, p2)->p1.name.compareTo(p2.name));
		for(Person p : result)
			out.println(p);*/
		
		persons.parallelStream().
			filter(p->p.age>=18).
			sequential().
			sorted((p1, p2)->p1.name.compareTo(p2.name)).
			map(p->p.name).
			forEach(out::println);		
		

	}

}
