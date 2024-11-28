package Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("********* Data protection **********");
        Employee emp = new Employee("Alice", 70000);
        System.out.println("Initial Salary: " + emp.getSalary());
        emp.increaseSalary(7000);  // Controlled access
        System.out.println("Updated Salary: " + emp.getSalary());

        System.out.println("********* Modularity and maintainability **********");
        Temperature temp = new Temperature(25);
        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());

        System.out.println("********* Code reusability **********");
        Stack stack = new Stack(5);  // Reusable in any application
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
    }
}





















