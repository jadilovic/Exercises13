package Vjezbe;

public class testRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational ra1 = new Rational(4, 2);
		Rational ra2 = new Rational(2, 3);
		Rational ra3 = new Rational(4, 2);
		
		System.out.println(ra1.add(ra2));
		System.out.println(ra1.toString());
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.subtract(ra2));
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.multiply(ra2));
		System.out.println(ra1 + " - " + ra2 +  " = " + ra1.divide(ra2));
		System.out.println(ra1 + " to double " + ra1.doubleValue() + " " + ra2 + " to double " + ra2.doubleValue());
		System.out.println(ra1.compareTo(ra2));
		
		Rational r1 = new Rational(1, 123456789);
		Rational r2 = new Rational(1, 123456789);
		Rational r3 = new Rational(1, 123456789);
		System.out.println("r1 * r2 * r3 is " + r1.multiply(r2.multiply(r3)));
		
		Rational rat1 = new Rational(-2, 6);
		System.out.println(rat1.getNumerator());
		System.out.println(rat1.getDenominator());
		System.out.println(rat1.intValue());
		System.out.println(rat1.doubleValue());
		
		Rational rr1 = new Rational(-2, 6);
		Object rr2 = new Rational(1, 45);
		System.out.println(r2.compareTo(r1));
		
		System.out.println(ra1.equals(ra2));
		System.out.println(ra3.equals(ra1));
		
		Rational rat4 = new Rational(1, 2);
		Rational rat5 = new Rational(1, -2);
		System.out.println(rat4.add(rat5));
	}

}
