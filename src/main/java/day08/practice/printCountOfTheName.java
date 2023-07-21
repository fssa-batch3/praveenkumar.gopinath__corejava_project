package day08.practice;


import java.util.HashMap;

public class printCountOfTheName {
    public static void main(String[] args) {
        String input = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";

        HashMap<String, Integer> str = new HashMap<>();
        String[] newName = input.split(", ");

        for (String name : newName){
          if (str.containsKey(name)) {
                int count = str.get(name);
                str.put(name, count + 1);
            } else {
                str.put(name, 1);
            }
        }
        for(String name : str.keySet()){
            int num = str.get(name);
            System.out.println(name+": "+num);
        }
    }
}

