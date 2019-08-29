package Vjezbe;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>{

		BigInteger numerator = new BigInteger("0");
		BigInteger denominator = new BigInteger("1");
		
		public Rational(){
			this(0, 1);
		}
		
		public Rational(long numerator, long denominator){
			long gcd = gcd(numerator, denominator);
			this.numerator = BigInteger.valueOf(((denominator > 0) ? 1 : -1) * numerator / gcd);
			this.denominator = BigInteger.valueOf(Math.abs(denominator) / gcd);
		}
		
		private static long gcd(long numerator2, long denominator2) {
			long num = Math.abs(numerator2);
			long den = Math.abs(denominator2);
			int gcd = 1;
			
			for(int k = 1; k <= num && k <= den; k++){
				if(num % k == 0 && den % k == 0)
					gcd = k;
			}
			return gcd;
		}

		public BigInteger getNumerator(){
			return numerator;
		}
		
		public BigInteger getDenominator(){
			return denominator;
		}
		
	public Rational add(Rational secondRational){
	Rational addR = new Rational();
	BigInteger addN = numerator.multiply(secondRational.denominator).add(denominator.multiply(secondRational.getNumerator()));
	BigInteger addD = denominator.multiply(secondRational.getDenominator());
			return new Rational(addN.longValue(), addD.longValue());
		}
		
		public Rational subtract(Rational secondRational){
			BigInteger addN = numerator.multiply(secondRational.denominator).subtract(denominator).multiply(secondRational.getNumerator());
			BigInteger addD = denominator.multiply(secondRational.denominator);
			return new Rational(addN.longValue(), addD.longValue());
		}
		
		public Rational multiply(Rational secondRational){
			BigInteger addN = numerator.multiply(secondRational.getNumerator());
			BigInteger addD = denominator.multiply(secondRational.getDenominator());
			return new Rational(addN.longValue(), addD.longValue());
		}
		
		public Rational divide(Rational secondRational){
			BigInteger addN = numerator.multiply(secondRational.getDenominator());
			BigInteger addD = denominator.multiply(secondRational.getNumerator());
			return new Rational(addN.longValue(), addD.longValue());
		}
		
		public String toString(){
			if(denominator == BigInteger.valueOf(1))
				return "" + numerator;
			return "" + numerator + "/" + denominator;
		}
		
		public boolean equals(Object other){
			//if((this.subtract((Rational)(other))).getNumerator() == 0)
			//	return true;
			//else
			//	return false;
			return other.equals(this.doubleValue());
		}
		
		@Override
		public int compareTo(Rational o) {
			if(this.subtract(o).getNumerator().longValue() > 0)
				return 1;
			if(this.subtract(o).getNumerator().longValue() < 0)
				return -1;
			else
			return 0;
		}

		@Override
		public double doubleValue() {
			return numerator.doubleValue() * 1.0 / denominator.doubleValue();
		}

		@Override
		public float floatValue() {
			return (float) doubleValue();
		}

		@Override
		public int intValue() {
			return (int) doubleValue();
		}

		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return (long) doubleValue();
		}
	}

