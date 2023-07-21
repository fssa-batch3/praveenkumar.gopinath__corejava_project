package day09.practice;

import java.util.Comparator;

public class SortTaskDate implements Comparator<Task> {
	public int compare(Task a, Task b) {

		int month = a.getDeadline().getMonth().compareTo(b.getDeadline().getMonth());

		if(month!= 0){
			return month;
		} else {
			if (a.getDeadline().getDayOfMonth()>b.getDeadline().getDayOfMonth()) {
				return 1;
			} else {
				return -1;
			}
		}

	}
}