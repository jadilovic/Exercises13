package Vjezbe;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

	private double width;
	private double height;
	
	public Rectangle(){
		System.out.println("R constructor");
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * width + 2 * height;
	}
	
	@Override
	public String toString(){
		return "" + getArea();
	}

	@Override
	public int compareTo(Rectangle o) {
		if(this.getArea() > o.getArea())
			return 1;
		else if(this.getArea() < o.getArea())
			return -1;
		else
		return 0;
	}
	
	public boolean equal(Object o){
		return this.compareTo((Rectangle)o) == 0;
	}
}

