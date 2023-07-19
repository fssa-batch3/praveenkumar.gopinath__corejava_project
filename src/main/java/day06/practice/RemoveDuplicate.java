package day06.practice;

import java.util.ArrayList; 
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        List<String> newCity = new ArrayList<>();
        for (String city : cityList) {
            boolean city2 = false;
          for (String newCity1 : newCity) {
             if (newCity1.equals(city)) {
            	 city2 = true;
               break;
           }
          }
          if (!city2) {
            newCity.add(city);
         }
        }
        for (String city : newCity) {
            System.out.println(city);
        }     
        System.out.println(cityList);        
        
    }
}
