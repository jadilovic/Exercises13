package Vjezbe;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle(double d) {
		super(d);
	}

	public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2){
		return c1.compareTo(c2) == 1 ? c1 : c2;
	}
	
	public int compareTo(ComparableCircle c) {
		if(this.getArea() > c.getArea())
			return 1;
		else if(this.getArea() < c.getArea())
			return -1;
		else
		return 0;
	}
}
