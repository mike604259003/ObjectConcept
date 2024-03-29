package th.ac.npru.swe.porntape.oop;

public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(int baseValue, int heightValue) {
		base = baseValue;
		height = heightValue;
	}

	@Override
	public double getArea() {
		calculate();
		return area;
	}

	private void calculate() {
		area = 0.5 * base * height;
	}

}
