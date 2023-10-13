package ru.specialist;

import java.util.Objects;

public final class PersonOld {
	private String name;
	private int age;
	
	public PersonOld(String name, int age) {
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
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    PersonOld p = (PersonOld) o;
	    return age == p.age &&
	            Objects.equals(name, p.name);
	}	
	
	@Override
	public String toString() {
	    return "PersonOld[" +
	            "name=" + name  +
	            ", age=" + age  +
	            ']';
	    
	}	
	
	

}
