package Vjezbe;

import java.math.BigInteger;
import java.util.Scanner;

public class decimalToFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter decimal number: ");
		
		Scanner input = new Scanner(System.in);
		
		String decNum = input.next();
		input.close();

		String[] stringNum = decNum.split(",");
		BigInteger integer = new BigInteger(stringNum[0]);
		BigInteger fraction = new BigInteger(stringNum[1]);
		long digits = 1;
		for(int i = 0; i < stringNum[1].length(); i++){
			digits = digits * 10;
		}
		
		System.out.println("integer " + integer);
		System.out.println("fraction " + fraction);
		
		RationalBig intg = new RationalBig(integer, BigInteger.ONE);
		RationalBig fra = new RationalBig(fraction, BigInteger.valueOf(digits));
		RationalBig res = intg.add(fra);
		System.out.println(res.toString());
	}

}
