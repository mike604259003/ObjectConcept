package th.ac.npru.swe.porntape.oop;

public abstract class Shape {

	protected String color;
	protected double area;

	abstract double getArea();

	public String toString() {
		return "Color  : " + color + "\nArea : " + area;
	}

	public void setColor(String colorValue) {
		color = colorValue;
	}

}
