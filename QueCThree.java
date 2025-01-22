// Write a program to remove the first occurance of a specified element from an array
import java.util.Arrays;

public class QueCThree {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 3, 6, 4, 4, 4};
        int elementToRemove = 4;

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the function to remove the element
        array = removeFirstOccurrence(array, elementToRemove);

        // Display the modified array
        System.out.println("Modified Array: " + Arrays.toString(array));
    }

    public static int[] removeFirstOccurrence(int[] array, int elementToRemove) {
        // Find the index of the first occurrence
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                index = i;
                break;
            }
        }

        // If the element is not found, return the original array
        if (index == -1) {
            System.out.println("Element not found in the array.");
            return array;
        }

        // Create a new array with one less element
        int[] newArray = new int[array.length - 1];

        // Copy elements to the new array, skipping the specified element
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
}

