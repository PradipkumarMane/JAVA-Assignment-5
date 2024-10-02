package Assignment1;

public class Rectangle {
	protected int length;
	protected int breadth;
	protected int area;
	protected int peri;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		area = length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}

	public void printPerimeter() {
		peri = area * 2;
		System.out.println("Perimeter of Rectangle is " + peri);
	}
}
