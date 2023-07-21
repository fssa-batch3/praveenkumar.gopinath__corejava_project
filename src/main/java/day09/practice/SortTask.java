package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTask {
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2023-07-16");
		LocalDate date2 = LocalDate.parse("2023-07-17");
		LocalDate date3 = LocalDate.parse("2023-07-18");

		Task task1 = new Task(1, "Playing", date1);
		Task task2 = new Task(2, "Working", date2);
		Task task3 = new Task(3, "Learning", date3);

		ArrayList<Task> arr = new ArrayList<>();
		arr.add(task1);
		arr.add(task2);
		arr.add(task3);

		Collections.sort(new ArrayList());	

        
		for (Task t : arr) {
			System.out.println("Id:"+t.getId() + " " +"Task Name:"+ t.getName() + " " +"Deadline:"+ t.getDeadline());
		}
	}

}