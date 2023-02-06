package Task;

abstract class Shape {
	abstract double area();
}

class Square extends Shape {
	double side;

	Square(double side) {
		this.side = side;
	}

	@Override
	double area() {
		return side * side;
	}
}

class Triangle extends Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double area() {
		return 0.5 * base * height;
	}
}

public class ShapeAbstract {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Square(2.0);
		shapes[1] = new Triangle(2.0, 3.0);

		for (Shape shape : shapes) {
			System.out.println("Area: " + shape.area());
		}
	}
}
