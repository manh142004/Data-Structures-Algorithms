package P6;
import java.lang.*;
import java.util.*;

class GFG {
    // Function to print all possible pairs
    static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    System.out.println(a[i] + " " + a[j]);
            }
        }
    }

    static boolean linearSearch(int[] a, int n,
                                int key)
    {
        // Traverse the given array, a[]
        for(int i = 0; i < n; i++)
        {
            // Check if a[i] is equal to key
            if (a[i] == key)
                return true;
        }
        return false;
    }
}