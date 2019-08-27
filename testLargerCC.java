package Vjezbe;

import Primjeri.Circle;

public class testLargerCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparableCircle cc1 = new ComparableCircle(11);
		ComparableCircle cc2 = new ComparableCircle(22);
		System.out.println("c1 area is: " + cc1.getArea());
		System.out.println("c2 area is: " + cc2.getArea());
		System.out.println("Greater Circle area is in " + ComparableCircle.max(cc1, cc2).toString());
		System.out.println("Name of the instance" + ComparableCircle.)
	}

}
