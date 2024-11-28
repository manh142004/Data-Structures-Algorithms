package P6;

public class LinearSearchExample {
    // Method to search for an element in an array
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) { // Iterates through the array
            if (array[i] == target) { // Checks if the current element matches the target
                return i; // Returns the index of the target element
            }
        }
        return -1; // Returns -1 if the element is not found
    }
}

