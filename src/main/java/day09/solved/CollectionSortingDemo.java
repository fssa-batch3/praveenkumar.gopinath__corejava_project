package day09.solved;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemo {
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("1");
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");
		cityNames.add("bangalore");
		cityNames.add("chennai");
		cityNames.add("delhi");
		

		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	}
}


