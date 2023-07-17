package day05.solved.package2;

import day05.solved.package1.Rectangle;

public class Square extends Rectangle {


//	param length
//	param breadth
//	throws Exception
	
	public Square(double sideLength) throws Exception {
		super(sideLength, sideLength);

	}

	public static void main(String[] args) {
		try {
			Square square = new Square(1.0);
			System.out.println(square.numberOfSides);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
