package day02.practice;

public class User {
    private int id;
    private String name;
    private String password;
    private String emailId;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmailId() {
    	return emailId;
    }
    public static void main(String[] args) { 
    	// set the information
        User user = new User();
        user.setId(6);
        user.setName("Praveen");
        user.setPassword("praveen469323");
        user.setEmailId("praveen@gmail.com");

        //print the information
        System.out.println("User ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email ID: " + user.getEmailId());
    }
	
}
