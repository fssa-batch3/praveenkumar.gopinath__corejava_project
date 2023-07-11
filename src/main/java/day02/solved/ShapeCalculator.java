package day02.solved;

public class ShapeCalculator {
	
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	
	public double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5);
		double rectangleArea = calculator.calculateArea(4.2, 6.8); 
		System.out.println("Circle area: " + circleArea);
		System.out.println("Rectangle area: " + rectangleArea);
	}
}