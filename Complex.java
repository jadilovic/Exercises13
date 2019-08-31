package Vjezbe;

public class Complex implements Cloneable{

	public double a, b;
	
	public Complex(){
		a = 0;
		b = 0;
	}
	
	public Complex(double a){
		this.a = a;
		b = 0;
	}
	
	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public Complex add(Complex scn2){
		double addFcn = (a + scn2.a);
		double addScn = (b + scn2.b);
		return new Complex(addFcn, addScn);
	}

	public double getRealPart() {
		return 0;
	}
	
	public double getImagineryPart() {
		return 0;
	}

	@Override
	public String toString(){
		return null;
	}
	
}
