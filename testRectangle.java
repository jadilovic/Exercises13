package Vjezbe;

public class testRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5, 7);
		Rectangle r3 = new Rectangle(5, 4);
		
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.equal(r2));
		System.out.println(r1.compareTo(r3));
		System.out.println(r1.equal(r3));
		System.out.println(r2.compareTo(r3));
		System.out.println(r2.equal(r3));
		
		System.out.println("R1 Rectangle is " + (r1.equal(r2) ? "" : "not ") + "equal to R2 Rectangle");
		System.out.println("R1 Rectangle is " + (r1.equal(r3) ? "" : "not ") + "equal to R2 Rectangle");
	}
}
