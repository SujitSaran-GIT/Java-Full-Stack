// Write a  program that removes all duplicate elements from an array and returns a new array.
// Sample Output:
// Original array: 1 3 5 1 3 7 9
// After removing duplicate elements from the said array: 1 3 5 7 9

public class QueFSix {
    public static void main(String[] args) {
        // Define the original array
        int[] array = {1, 3, 5, 1, 3, 7, 9};

        // Print the original array
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Remove duplicates and get the new array
        int[] uniqueArray = removeDuplicates(array);

        // Print the array after removing duplicates
        System.out.print("After removing duplicate elements from the said array: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // User-defined function to remove duplicates
    public static int[] removeDuplicates(int[] array) {
        // Temporary array to mark unique elements
        boolean[] visited = new boolean[101]; // Assuming array values range between 0 and 100
        int count = 0;

        // Count unique elements
        for (int num : array) {
            if (!visited[num]) {
                visited[num] = true;
                count++;
            }
        }

        // Create new array to store unique elements
        int[] uniqueArray = new int[count];
        int index = 0;

        // Populate the unique array
        for (int num : array) {
            if (visited[num]) {
                uniqueArray[index++] = num;
                visited[num] = false; // Reset to prevent adding duplicates again
            }
        }

        return uniqueArray;
    }
}
