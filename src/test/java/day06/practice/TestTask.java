package day06.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

class Task1 {
    String taskName;
    int priority;

    
    
    public Task1 (String taskName, int priority) {
    	
    this.taskName = taskName;
    this.priority = priority;
    
    }
    }


public class TestTask {		
		   @Test
		   public void testTaskList() {
		        List<Task1> taskList = new ArrayList<>();
		              

		        Task1 task1 = new Task1("wakeup", 2);
		        Task1 task2 = new Task1("brushing", 2);
		        Task1 task3 = new Task1("bathing", 2);
		        Task1 task4 = new Task1("dressing", 1);

		        taskList.add(task1);
			      taskList.add(task2);
			      taskList.add(task3);
			      taskList.add(task4);


		        assertEquals(4, taskList.size());

		        Task1 firstTask = taskList.get(0);
		        assertEquals("wakeup", firstTask.taskName);
		        assertEquals(2, firstTask.priority);

		        Task1 secondTask = taskList.get(1);
		        assertEquals("brushing", secondTask.taskName);
		        assertEquals(2, secondTask.priority);

		        Task1 thirdTask = taskList.get(2);
		        assertEquals("bathing", thirdTask.taskName);
		        assertEquals(2, thirdTask.priority);
		        
		        
		        Task1 fourthTask = taskList.get(3);
		        assertEquals("dressing", fourthTask.taskName);
		        assertEquals(1, fourthTask.priority);
		    }

	

}