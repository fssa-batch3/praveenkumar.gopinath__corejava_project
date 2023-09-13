package parciticeSums;

public class Car {
    // Attribute
    private String model;

    // Method to set the model attribute
    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // First instance of Car
        car1.setModel("Toyota");

        Car car2 = new Car(); // Second instance of Car
        car2.setModel("Honda");
    }
}