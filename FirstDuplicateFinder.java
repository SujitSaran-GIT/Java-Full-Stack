// 4. Write a program to find the first duplicate element in a given array of integers. Return -1 if there are no such element

import java.util.HashSet;

public class FirstDuplicateFinder {
    public static int findFirstDuplicate(int[] array) {
        // Create a HashSet to store visited elements
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : array) {
            // Check if the current number is already in the set
            if (seen.contains(num)) {
                return num; // Return the duplicate element
            }
            // Add the current number to the set
            seen.add(num);
        }

        // If no duplicate is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 10, 50, 20};
        int firstDuplicate = findFirstDuplicate(array);
        if (firstDuplicate != -1) {
            System.out.println("First duplicate element: " + firstDuplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}
