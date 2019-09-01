package Vjezbe;

import java.util.Scanner;

public class parabolaEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner Object
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a, b and c and 
				// create three Rational objects form input
				System.out.print("Enter a, b, c: ");
				Rational a = new Rational(input.nextLong(), 1);
				Rational b = new Rational(input.nextLong(), 1);
				Rational c = new Rational(input.nextLong(), 1);

				// Compute h and k
				// h = -b / 2a
				Rational h = new Rational(-b.getNumerator(), 2 * a.getNumerator());

				// k = f(h) = a * h^2 + b * h + c
				Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);

				// Display results
				System.out.println("h is " + h + " k is " + k);
	}

}
