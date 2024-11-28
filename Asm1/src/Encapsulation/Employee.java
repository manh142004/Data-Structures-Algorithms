package Encapsulation;

public class Employee {
    private String name;  // Private data
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    // Public getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;  // Protecting data from invalid modifications
        }
    }
}
