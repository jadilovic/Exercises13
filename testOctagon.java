package Vjezbe;

public class testOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(5);
		System.out.println("Octagon O1 has area of " + o1.getArea() + " and perimeter of " + o1.getPerimeter());
		Octagon o2 = (Octagon) o1.clone();
		System.out.println("Octagon O2 has area of " + o2.getArea() + " and perimeter of " + o2.getPerimeter());
		Octagon o3 = new Octagon(8);
		System.out.println(o1.compareTo(o3));
	}

}
