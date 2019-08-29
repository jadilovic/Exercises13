package Vjezbe;

public class newRational extends Number implements Comparable<newRational>{

	private long[] r = new long[2];
	
	public newRational(){
	}
	
	public newRational(long numerator, long denominator){
		long gcd = gcd(numerator, denominator);
		r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[1] = Math.abs(denominator) / gcd;
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

	public long getNumerator(){
		return r[0];
	}
	
	public long getDenominator(){
		return r[1];
	}
	
	public newRational add(newRational secondRational){
		newRational addR = new newRational();
		long addN = r[0] * secondRational.r[1] + r[1] * secondRational.getNumerator();
		long addD = r[1] * secondRational.getDenominator();
		addR = new newRational(addN, addD);
		return addR;
		
	}
	
	public newRational subtract(newRational secondRational){
		long addN = r[0] * secondRational.r[1] - r[1] * secondRational.getNumerator();
		long addD = r[1] * secondRational.r[1];
		return new newRational(addN, addD);
	}
	
	public newRational multiply(newRational secondRational){
		long addN = r[0] * secondRational.getNumerator();
		long addD = r[1] * secondRational.getDenominator();
		return new newRational(addN, addD);
	}
	
	public newRational divide(newRational secondRational){
		long addN = r[0] * secondRational.getDenominator();
		long addD = r[1] * secondRational.getNumerator();
		return new newRational(addN, addD);
	}
	
	public String toString(){
		if(r[1] == 1)
			return "" + r[0];
		return "" + r[0] + "/" + r[1];
	}
	
	public boolean equals(Object other){
		//if((this.subtract((Rational)(other))).getNumerator() == 0)
		//	return true;
		//else
		//	return false;
		return other.equals(this.doubleValue());
	}
	
	@Override
	public int compareTo(newRational o) {
		if(this.subtract(o).getNumerator() > 0)
			return 1;
		if(this.subtract(o).getNumerator() < 0)
			return -1;
		else
		return 0;
	}

	@Override
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
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
