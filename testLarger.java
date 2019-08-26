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
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println((c1.compareTo(c2)));
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println((r1.compareTo(r2)));
	}
}
