package Encapsulation;

public class Temperature {
    private double celsius;  // Data stored in Celsius

    // Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Public method to get Fahrenheit
    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;  // Logic change doesn't affect usage
    }

    // Public method to set temperature in Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
