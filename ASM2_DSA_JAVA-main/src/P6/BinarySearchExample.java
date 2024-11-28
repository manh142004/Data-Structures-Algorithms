package P6;

public class BinarySearchExample {

    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (array[mid] == target) {
                return mid; // Target found at mid
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}
