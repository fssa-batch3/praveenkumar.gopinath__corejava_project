package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

import day08.practice.EmployeeList;

public class TestListOfEmployees {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma separated list of DeptName, EmployeeName");
		String str = scan.nextLine().trim();
		scan.close();

		EmployeeList names = new EmployeeList();

		System.out.println("The list of employees");
		System.out.println();

		HashMap<String, String> map = names.list(str);

		map.forEach((key, value) -> System.out.println(key + ": [" + value + "]"));

	}

}