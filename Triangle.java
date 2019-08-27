package Vjezbe;

import Primjeri.GeometricObject;

public class Triangle extends GeometricObject{
	
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(){
		this.s1 = 1;
		this.s2 = 1;
		this.s3 = 1;
	}

	public Triangle(double s1, double s2, double s3, String color, boolean filled) {
		super(color, filled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public double getArea() {
		double s = (s1 + s2 + s3) / 2;
		
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	@Override
	public double getPerimeter() {
		return s1 + s2 + s3;
	}
	
	@Override
	public String toString(){
		return "Triangle areas is: " + getArea() + ", perimater: " + getPerimeter() + 
				"\nwith color: " + getColor() + ", and is filled: " + isFilled();
	}

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
