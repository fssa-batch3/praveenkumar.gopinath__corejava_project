package day05.solved.package2;

import day05.solved.package1.*;

public class SomeOtherClass {

	public static void main(String[] args) {
		try {
			Rectangle rectangle = new Rectangle(1.0, 1.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}