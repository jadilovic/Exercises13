package Vjezbe;

import java.util.Scanner;

public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of the triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		System.out.println("Enter ture or false whether the triangle is filled");
		boolean filled = input.nextBoolean();
		Triangle tr = new Triangle(s1, s2, s3, color, filled);
		System.out.println(tr.toString());
		input.close();	
	}
}
