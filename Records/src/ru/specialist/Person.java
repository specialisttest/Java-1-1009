package ru.specialist;

/*
  
Особенности
  Неизменный класс с двумя полями
  Конструктор присваивает эти поля
  Геттеры
  equals(), hashCode() и toString()

Ограничения

 - Записи не могут расширять любой класс, 
   хотя они могут реализовывать интерфейсы.
 - Записи не могут быть абстрактными.
 - Записи неявно являются final; они не могут быть унаследованы
 - Можете объявить дополнительные поля в теле записи, 
   но только если они статичны
 
 */

// public final class Person extends java.lang.Record

// since Java 14
public record Person(String name, int age) {
	
//	@Override
//	public String toString() {
//		return String.format("%s - %d", name(), age());
//	}
	
}


















