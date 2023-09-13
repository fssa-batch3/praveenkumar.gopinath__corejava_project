package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class TaskObj {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 2"); 
        tasks.add("Task 4");
        tasks.add("Task 1"); 
        
        System.out.println("Original ArrayList: " + tasks);
        
        HashSet<String> uTasks = new HashSet<>(tasks);
        tasks.clear();
        tasks.addAll(uTasks);
        
        System.out.println(tasks);
    }
}


