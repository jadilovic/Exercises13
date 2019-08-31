package Vjezbe;

import java.math.BigInteger;

public class RationalBig extends Number implements Comparable<Rational>{

		BigInteger numerator = new BigInteger("0");
		BigInteger denominator = new BigInteger("1");
		BigInteger nista = new BigInteger("0");
		
		public RationalBig(){
			this(new BigInteger("0"), new BigInteger("1"));
		}
		
		public RationalBig(BigInteger numerator, BigInteger denominator){
			BigInteger gcd = gcd(numerator, denominator);
			this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(numerator.divide(gcd));
			this.denominator = denominator.divide(gcd);
		}
		
		private static BigInteger gcd(BigInteger numerator2, BigInteger denominator2) {
			BigInteger num = numerator2;
			BigInteger den = denominator2;
			BigInteger gcd = BigInteger.ONE;
			
for (BigInteger k = BigInteger.ONE; k.compareTo(num) <= 0 && k.compareTo(den) <= 0; k = k.add(BigInteger.ONE)) {
		if (num.remainder(k).compareTo(BigInteger.ZERO) == 0 && den.remainder(k).compareTo(BigInteger.ZERO) == 0)
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
		
	public RationalBig add(RationalBig secondRational){
	RationalBig addR = new RationalBig();
	BigInteger addN = numerator.multiply(secondRational.denominator).add(denominator.multiply(secondRational.getNumerator()));
	BigInteger addD = denominator.multiply(secondRational.getDenominator());
			return new RationalBig(addN, addD);
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
