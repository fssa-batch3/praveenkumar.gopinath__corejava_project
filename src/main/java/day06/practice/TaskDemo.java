package day06.practice;

import java.util.*;

public class TaskDemo {

	private ArrayList<Task> tasks = new ArrayList<>();
	
	public ArrayList<Task> getTasks(){
		return this.tasks;
	}

	public void addTask(String name, int priority) {
		Task task = new Task(name, priority);
		tasks.add(task);
	}

	public void printTasks() {
		for (Task task : tasks) {
			System.out.println("For Task " + task.getTaskName() + " has priority number " + task.getPriority());

		}

	}

	public static void main(String[] args) {

		TaskDemo task = new TaskDemo();

		task.addTask("Wake", 3);
		task.addTask("Eat", 3);
		task.addTask("Play", 5);
		task.addTask("Sleep", 3);
		
		task.printTasks();

	}

}