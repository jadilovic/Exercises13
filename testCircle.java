package Vjezbe;

public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(5);
		
		System.out.println("c1.equals(c2) " + c1.equals(c2));
		System.out.println("c1.equals(c3) " + c1.equals(c3));
		
		System.out.println();
		System.out.println("Circle1 radius: " + c1.getRadius());
		System.out.println("Circle2 radius: " + c2.getRadius());
		System.out.println("Circle3 radius: " + c3.getRadius());
		
		System.out.println();
		System.out.println("c1.compareTo(c2) " + c1.compareTo(c2));
		System.out.println("c1.compareTo(c3) " + c1.compareTo(c3));
		
		System.out.println("Circle c1 is " + (c1.equals(c2) ? "" : "not ") + "equal to circle c2");
		System.out.println("Circle c1 is " + (c1.equals(c3) ? "" : "not ") + "equal to circle c3");
	}

}
