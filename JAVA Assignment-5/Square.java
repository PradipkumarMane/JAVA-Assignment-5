package Assignment1;

public class Square extends Rectangle {
	private int side;

	public Square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}

	public void printArea() {
		super.printArea();
		area = side * side;
		System.out.println("Area of Square is " + area);
	}

	public void printperimeter() {
		super.printPerimeter();
		peri = 4 * side;
		System.out.println("Perimeter of Square is " + peri);
	}
}
