package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(5);
        numbers.add(7);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
       
        System.out.println(numbers);
    	HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
    	
    	
    	ArrayList<Integer> uniqueNewnumbers = new ArrayList<>(uniqueNumbers);
        System.out.println(uniqueNewnumbers);
    }
}
