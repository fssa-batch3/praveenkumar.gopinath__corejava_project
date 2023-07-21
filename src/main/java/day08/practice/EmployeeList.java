package day08.practice;

import java.util.*;

public class EmployeeList {
	public static void main(String[] args) {
		Map<String, List<String>> departmentMap = new HashMap<>();
		String input = "HR,Ram\nHR,Suresh\nIT,Basker\nIT,Joseph\nAdmin,Sundar";
		Arrays.stream(input.split("\n")).map(line -> line.split(",")).forEach(parts -> {
			String deptName = parts[0].trim();
			String employeeName = parts[1].trim();
			departmentMap.computeIfAbsent(deptName, k -> new ArrayList<>()).add(employeeName);
		});
		departmentMap.forEach((deptName, employees) -> System.out.println(deptName + ", " + employees));
	}
}
