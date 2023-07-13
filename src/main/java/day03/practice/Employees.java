package day03.practice;

public class Employees {

	private int id;
	private String name;

	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Employees e1 = new Employees(1, "Praveen");
		Employees e2 = new Employees(2, "Kumar");

		System.out.print("id=" + e1.id + ", ");
		System.out.println("name=" + e1.name);
		System.out.print("id=" + e2.id + ", ");
		System.out.println("name=" + e2.name);
	}

}