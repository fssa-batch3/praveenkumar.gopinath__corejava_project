package day06.practice;
import java.util.ArrayList;


public class RemoveDuplicate2 {
	public static void main(String[] args) {
		
	
	ArrayList<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
	System.out.println(cityList);
	System.out.println(cityList.size());
	System.out.println(cityList.remove(3));
	System.out.println(cityList);
	System.out.println(cityList.size());
//Add logic to remove the duplicate Array and 
//store the unique city name is an another ArrayList
}
}
