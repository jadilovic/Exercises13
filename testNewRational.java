package Vjezbe;

public class testNewRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newRational ra1 = new newRational(4, 2);
		newRational ra2 = new newRational(2, 3);
		newRational ra3 = new newRational(4, 2);
		
		System.out.println(ra1.add(ra2));
		System.out.println(ra1.toString());
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.subtract(ra2));
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.multiply(ra2));
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.divide(ra2));
		System.out.println(ra1 + " to double " + ra1.doubleValue() + " " + ra2 + " to double " + ra2.doubleValue());
		System.out.println(ra1.compareTo(ra2));
		
		newRational r1 = new newRational(1, 123456789);
		newRational r2 = new newRational(1, 123456789);
		newRational r3 = new newRational(1, 123456789);
		System.out.println("r1 * r2 * r3 is " + r1.multiply(r2.multiply(r3)));
		
		newRational rat1 = new newRational(-2, 6);
		System.out.println(rat1.getNumerator());
		System.out.println(rat1.getDenominator());
		System.out.println(rat1.intValue());
		System.out.println(rat1.doubleValue());
		
		newRational rr1 = new newRational(-2, 6);
		Object rr2 = new newRational(1, 45);
		System.out.println(r2.compareTo(r1));
		
		System.out.println(ra1.equals(ra2));
		System.out.println(ra3.equals(ra1));
		
		newRational rat4 = new newRational(1, 2);
		newRational rat5 = new newRational(1, -2);
		System.out.println(rat4.add(rat5));
	}

}
