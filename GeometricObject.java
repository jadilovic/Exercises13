package Vjezbe;

public abstract class GeometricObject{

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject(){
		this.dateCreated = new java.util.Date();
		// System.out.println("GO constructor");
	}
	
	protected GeometricObject(String color, boolean filled){
		this.dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	@Override
	public String toString(){
		return "Rectangle date created: " + dateCreated + " with color " + color + " and filled: " + filled;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	//@Override
	public int compareTo(GeometricObject o){
		if(this.getArea() > o.getArea())
			return 1;
		else if(this.getArea() < o.getArea())
			return -1;
		else
		return 0;
	}
	
	public static GeometricObject max(GeometricObject o1, GeometricObject o2){
		return o1.compareTo(o2) == 1 ? o1 : o2;
		
	}
	
	public abstract double getArea();
		
	public abstract double getPerimeter();
}
