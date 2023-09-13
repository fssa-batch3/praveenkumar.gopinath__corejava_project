package day03.practice;



public class TestUser {
public static void main(String[] args) {
		
		User user1 = new User("Praveen","praveen@gmail.com","pravyn123");
		System.out.println("Name: "+user1.getName());
		System.out.println("Email: "+user1.getEmail());
		System.out.println("Password: "+user1.getPassword());
		
		
		
		
		System.out.println();
		
		User user2 = new User("kumar","kumar@gmail.com","kumar469323");
		
		System.out.println("Name: "+user2.getName());
		System.out.println("Email: "+user2.getEmail());
		System.out.println("Password: "+user2.getPassword());
		
		
		User user3 = new User("praveenkumar@gmail.com", "123456");
		System.out.println("Email: "+user3.getEmail());	
		System.out.println("Password: "+user3.getPassword());	

	}
}
