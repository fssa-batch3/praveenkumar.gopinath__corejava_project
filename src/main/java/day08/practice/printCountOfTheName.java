package day08.practice;


import java.util.HashMap;

public class printCountOfTheName {
    public static void main(String[] args) {
        HashMap<String, Integer> countName = new HashMap<>();
        String input = "Ram, Ram, Superman, spider, hey, hello, hey, Spider";
        String[] names = input.split(",");
        for (String name : names) {
            String newName = name.trim();
            if (countName.containsKey(newName)){             
             int count = countName.get(newName);
                countName.put(newName, count + 1);
            } else {
                
            	countName.put(newName, 1);
            }
        }
        for (String name : countName.keySet()) {
            int count = countName.get(name);
            System.out.println(name + count);
        }
    }
}
