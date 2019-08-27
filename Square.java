package Vjezbe;

public class Square extends GeometricObject implements Colorable{

	private double side;
	
	public Square(){
		System.out.println("S constructor");
	}
	
	public Square(double side){
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled){
		this.side = side;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

}
