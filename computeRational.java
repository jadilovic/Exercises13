package Vjezbe;

import java.math.BigInteger;

public class computeRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RationalBig r1 = new RationalBig(new BigInteger("1"), new BigInteger("2"));
		System.out.println(r1.toString());
		
		RationalBig r2 = new RationalBig(new BigInteger("2"), new BigInteger("3"));
		System.out.println(r2.toString());
		
		RationalBig r3 = r1.add(r2);
		System.out.println(r3.toString());
		
		for(int i = 3; i < 100; i++){
		RationalBig temp = new RationalBig(BigInteger.valueOf(i), BigInteger.valueOf(i + 1));
		System.out.println(temp.toString());
		r3 = r3.add(temp);
		System.out.println(r3.toString());
		}
	}

}
