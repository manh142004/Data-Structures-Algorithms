package P6;

public class BubbleSortExample {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons in the current pass
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred during a pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
