package Vjezbe;

public class sumAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] gol = new GeometricObject[4];
		gol[0] = new Circle(5);
		gol[1] = new Circle(7);
		gol[2] = new Rectangle(3, 7);
		gol[3] = new Rectangle(5, 9);
		
		System.out.println(sumArea(gol));
	}

	public static double sumArea(GeometricObject[] gol) {
		double totalArea = 0;
		for(int i = 0; i < gol.length; i++){
			System.out.println(gol[i].getArea());
			totalArea += gol[i].getArea();
		}
		return totalArea;
	}

}
