package Vjezbe;

public class testColorable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] list = new GeometricObject[5];
		for(int i = 0; i < list.length; i++){
			list[i] = new Square(i * 5);
		}
		list[4] = new Circle(6);
		
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i].getArea() + " is it colorable ");
			if(list[i] instanceof Colorable){
				((Colorable) list[i]).howToColor();
				}
		}
	}
}
