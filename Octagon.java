package Vjezbe;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

	private double side;
	
	public Octagon(){
		
	}
	
	public Octagon(double side){
		this.setSide(side);
	}
	
	@Override
	public int compareTo(Octagon o) {
		if(this.side > o.side)
		 	return 1;
		else if(this.side < o.side)
			return -1;
		return 0;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2))*side*side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
}
}
