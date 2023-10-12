package ru.specialist;

import ru.specialist.graph.*;
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

/* I. Лабораторная работа (наследование)
 * class Shape
 * 		String color
 * 		Shape()
 * 		draw()
 * class Point extends Shape
 * 		int x,y
 * 		Point()
 * 		@Override draw()
 * 		@Override String toString()
 * 		moveBy(dx, dy)
 * class Circle extends Shape
 * 		int x,y,r
 * 		Circle()
 * 		@Override draw()
 * 		void scale(double factor)
 * class Line extends Shape
 * 		int x1,y1,x2,y2
 * 		Line()
 * 		@Override draw()
 */
/*
 *  II. Лабораторная работа (STATIC)
 * 		В классе Shape сделать статическое поле
 * 		типа коллекция List<Shape> scene
 * 		Сделать так, чтобы каждый вновь создаваемый
 * 	    графический объект (Point, Circle, Line)
 * 		добавлялись в эту коллекцию автоматическую.
 * 
 * 		В классе Shape сделать статический метод
 * 		static void drawScene(), который должен
 * 		перебирая коллекцию, вызывать для каждого
 * 		объекта метод draw()
 * 
 * 		В программе создать объекты Point,Circle, Line
 * 		Затем вызвать drawScene()
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
			//Point p1 = new Point(10, 20, "green");
			Point p1 = ShapeFactory.instance.createPoint(10, 20, "green");
			p1.moveBy(2, -3);
			//p1.draw(); // Point.draw()
			Shape s1 = p1; // implicit conv
			s1.draw(); // Point.draw()
			
			if (s1 instanceof Point) {
				Point p2 = (Point)s1; // explicit conv
			}
			
			Object o = p1;
			if (o instanceof Point) {
				Point p2 = (Point)o;
			}
			System.out.println(o.toString());
			
			//System.out.println(p1.toString());
			//System.out.println(p1);
			
			try {
				//Circle c1 = new Circle(100, 200, -100, "pink");
				Circle c1 = ShapeFactory.instance.createCircle(100, 200, 100, "pink");
				//c1.setR(-100);
				//c1.scale(2);
				System.out.println(c1.getR());
				Scaleable sc = c1;
				sc.scale(); // Circle.scale
				
				s1 = c1;
				s1.draw(); //Circle.draw()
				o = c1;
				
				/* VMT
				 * Class		Method		Address
				 * Shape		draw		XXX
				 * Point		draw		YYY
				 * Circle		draw		ZZZ
				 * Line			draw		AAA
				 * 
				 */
				
				if (s1 instanceof Point) {
					Point p2 = (Point)s1;
				}
				
				//Line l1 = new Line(1, 1, 10, 10, "red");
				Line l1 = ShapeFactory.instance.createLine(1, 1, 10, 10, "red");
				
				Shape s2 = l1; //new Shape();
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			Scaleable.scaleScene(2);
			Shape.drawScene();
			
			
			o = "abc";
			
			int k = 10;
			o = k; // (Object) new Integer(k)
			if (o instanceof Integer) {
				int k2 = (int)o;
			}
			
			Integer a = 5;
			Integer b = 2;
			Integer c = a * b; // 2 unboxing + 1 boxing
			
		}
		{
			Singleton s1  = Singleton.getInstance();
			Singleton s2  = Singleton.getInstance();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1 == s2);
			
						
		}

	}

}
