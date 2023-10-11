package ru.specialist;

import ru.specialist.graph.Point;
import ru.specialist.stuff.Person;

/* Создать класс Point в пакете ru.specialist.graph
 * 	Создать поля x,y типа int
 *  Создать конструктор(ы) для инициализации этих полей
 *  Создать методы:
 *  	draw() - вевести информацию о точке в виде: Point (10,20)
 *      moveBy(dx, dy) - сместить точку на указанные в параметрах
 *      смещения
 * 
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		{
			System.out.println("1");
			
			Person.showTotal();
			
			Person p1 = new Person("Сергей", 46);
			//p1.name = "Сергей";
			//p1.age = 46;
			
			Person p2 = new Person("Елена");
			//p2.name = "Елена";
			//p2.age  = 25;
			
			Person px = new Person();
					
			
			p1.show(); // this = p1
			p2.show(); // this = p2
			px.show();
			
			Person.showTotal();
		}
		{
			Point p1 = new Point(10, 20, "green");
			p1.moveBy(2, -3);
			p1.draw();
			
		}

	}

}
