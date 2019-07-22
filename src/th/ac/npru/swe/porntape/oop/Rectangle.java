package th.ac.npru.swe.porntape.oop;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int lengthValue, int widthValue) {
		length = lengthValue;
		width = widthValue;
	}

	@Override
	public double getArea() {
		calculate();
		return area;
	}

	private void calculate() {
		area = length * width;
	}

}
