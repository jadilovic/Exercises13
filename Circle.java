package Vjezbe;

public class Circle extends GeometricObject implements Comparable<Circle>{

	private double radius;
	
	public Circle(){
		System.out.println("C constructor");
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	@Override
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	@Override
	public String toString(){
		return "" + getArea();
	}
	
	public boolean equals(Circle o){
		return this.getRadius() == o.getRadius();
	}

	@Override
	public int compareTo(Circle o) {
		if(this.equals(o))
			return 1;
		else
		return -1;
	}
}