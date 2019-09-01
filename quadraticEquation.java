package Vjezbe;

import java.util.Scanner;

public class quadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter values for a, b and c.
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Compute the discriminant of the quadriatic equation.
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		// Compute the real roots of the quadriatic equation if any.
		System.out.print("The equation has ");
		if (discriminant > 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
			System.out.println("two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("one root " + root1);
		}
		else{
			System.out.println("no real roots");
			Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
			Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
			System.out.println("The roots are: " + root1 + " and " + root2);
		}
	}
}
