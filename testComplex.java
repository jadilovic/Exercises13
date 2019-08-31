package Vjezbe;

import java.util.Scanner;

public class testComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] firstComNum = new double[2];
		double[] secondComNum = new double[2];
		Complex[] results = new Complex[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first complex number: ");
		
		firstComNum[0] = input.nextDouble();
		firstComNum[1] = input.nextDouble();
		
		System.out.println("Enter the second complex number: ");
		secondComNum[0] = input.nextDouble();
		secondComNum[1] = input.nextDouble();
		input.close();
		
		Complex fNum = new Complex(firstComNum[0], firstComNum[1]);
		Complex sNum = new Complex(secondComNum[0], secondComNum[1]);
		
		results[0] = fNum.add(sNum);
		
		for(int i = 0; i < results.length; i++){
		System.out.println("(" + firstComNum[0] + " + " + firstComNum[1] + ") + (" + secondComNum[0] + " + " + secondComNum[1] + ")" +
		" = " + results[i].a + " + " + results[i].b);
		}
	}

}