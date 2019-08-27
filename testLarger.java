package Vjezbe;

import Primjeri.Circle;
import Primjeri.GeometricObject;
import Primjeri.Rectangle;

public class testLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeometricObject c1 = new Circle(6);
		GeometricObject c2 = new Circle(9);
		GeometricObject r1 = new Rectangle(5, 9);
		GeometricObject r2 = new Rectangle(8, 9);
		System.out.println("c1 area is: " + c1.getArea());
		System.out.println("c2 area is: " + c2.getArea());
		System.out.println("Greater Circle area is in " + Circle.max(c1, c2).toString());
		System.out.println("r1 area is: " + r1.getArea());
		System.out.println("r2 area is: " + r2.getArea());
		System.out.println("Greater Rectangle area is in " + Rectangle.max(r1, r2).toString());
	}
}
