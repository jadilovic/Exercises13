package Vjezbe;

public class testMyStack {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		MyStack ms = new MyStack();
		//GeometricObject go = new Circle();
		for(int i = 1; i < 5; i++){
			ms.push(new Circle(i * 5));
		}
		
		System.out.println(ms.toString());
		System.out.println("Is Empty? " + ms.isEmpty());
		System.out.println("Peek: " + ms.peek());
		System.out.println("Size: " + ms.getSize());
		System.out.println("Pop: " + ms.pop());
		ms.push(new Square(5));
		System.out.println("ms " + ms.toString());
		
		MyStack msc = (MyStack) ms.clone();
		MyStack msd = ms;
	
		System.out.println("msc " + msc.toString());
		System.out.println(ms == msc);
		System.out.println(ms.equals(msc));
		
		System.out.println("msd " + msd.toString());
		System.out.println(ms == msd);
		System.out.println(ms.equals(msd));
	}
}
