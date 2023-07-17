package day05.practice;

public class DepartmentTest {
	public static void main(String[] args) {
		Department department = new Department("Computer", 400);
		Student student = new Student("PraveenKumar", 500, department);
		System.out.println(student);
	}
}