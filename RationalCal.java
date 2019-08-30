package Vjezbe;

public class RationalCal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if(args.length != 3){
		//	System.out.println("Usage: RationalCal operand1 operator operand2");
		//	System.exit(0);
		//}
		
		//System.out.println(args.toString());
		
		String operand1 = "3/4";
		String operand2 = "1/5";
		String operator = "*";
		
		String[] arrOp1 = operand1.split("/", 2);
		long numerator = Long.parseLong(arrOp1[0]);
		long denominator = Long.parseLong(arrOp1[1]);
		Rational r1 = new Rational(numerator, denominator);
		
		String[] arrOp2 = operand2.split("/", 2);
		long numerator2 = Long.parseLong(arrOp2[0]);
		long denominator2 = Long.parseLong(arrOp2[1]);
		Rational r2 = new Rational(numerator2, denominator2);
		// The result of the operation
		Rational result = new Rational();
	
		// Determine the operator
		switch (operator.charAt(0)) {
			case '+': result = r1.add(r2);
			break;
			case '-': result = r1.subtract(r2);
			break;
			case '*': result = r1.multiply(r2);
			break;
			case '/': result = r1.divide(r2);
			break;
		}
		
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result.getNumerator() + "/" + result.getDenominator());
	}

}
