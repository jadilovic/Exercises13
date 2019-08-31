package Vjezbe;

public class Complex implements Cloneable{

	private double a, b;
	private double real, imag;
	
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
	
	public String add(Complex scn){
		real = (a + scn.a);
		imag = (b + scn.b);
		return "(" + a + " + " + b + "i) + (" + scn.a + " + " + scn.b + "i) = " + real + " + " + imag + "i";
	}
	
	public String subtract(Complex scn){
		real = (a - scn.a);
		imag = (b - scn.b);
		return "(" + a + " + " + b + "i) - (" + scn.a + " + " + scn.b + "i) = " + real + " + " + imag + "i";
	}
	
	public String multiply(Complex scn){
		real = (a * scn.a) - (b * scn.b);
		imag = (b * scn.a) + (a * scn.b);
		return "(" + a + " + " + b + "i) * (" + scn.a + " + " + scn.b + "i) = " + real + " + " + imag + "i";
	}
	
	public String divide(Complex scn){
		real = ((a * scn.a + b * scn.b) / (Math.pow(scn.a, 2) + Math.pow(scn.b, 2))) + ((b * scn.a) - (a * scn.b)) / (Math.pow(scn.a, 2) + Math.pow(scn.b, 2));
		imag = (b * scn.a + a * scn.b);
		return "(" + a + " + " + b + "i) / (" + scn.a + " + " + scn.b + "i) = " + real + " + " + imag + "i";
	}
	
	public String abs(){
		return "" + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public String getRealPart() {
		return "" + real;
	}
	
	public String getImagineryPart() {
		return imag + "i";
	}

	//@Override
	//public String toString(){
	//	if(imag == 0)
	//		return getRealPart();
	//	else
	//	return "(" + getRealPart() + " + " + getImagineryPart() + ")";
	//}
	
	@Override /** Retrun a string description 
	of this complex number */
public String toString() {
	return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
}
	
	@Override /** Override the protectec clone method defined in
	the Object class, and strengthen its accexxibility */
public Complex clone() throws CloneNotSupportedException {
	return (Complex)super.clone();
}
}
