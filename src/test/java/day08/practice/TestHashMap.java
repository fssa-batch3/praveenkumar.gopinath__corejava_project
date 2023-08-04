package day08.practice;

import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        try (var scan = new Scanner(System.in)) {
            System.out.println("Enter a comma separated list of names");
            String str = scan.nextLine();

            TestHashMap names = new TestHashMap();

            System.out.println("The count of the list of names");

            try {
                char[] result = names.count(str);
                if (result != null) {
                    System.out.println(result);
                } else {
                    System.out.println("Error: Unable to count the names.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private char[] count(String str) throws Exception {
        throw new Exception("Method is not implement.");
       
    
    }
}
