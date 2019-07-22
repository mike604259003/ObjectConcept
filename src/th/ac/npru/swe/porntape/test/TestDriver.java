package th.ac.npru.swe.porntape.test;

import th.ac.npru.swe.porntape.oop.Rectangle;
import th.ac.npru.swe.porntape.oop.Triangle;

public class TestDriver {

	public static void main(String[] args) {
		

		Rectangle r1 = new Rectangle(4, 6);
		r1.getArea();
		r1.setColor("Red");
		System.out.println(r1.toString());
		
		
		Triangle t1 = new Triangle(5,10);
		t1.getArea();
		t1.setColor("Pink");
		System.out.print(t1.toString());
	}
 
}
