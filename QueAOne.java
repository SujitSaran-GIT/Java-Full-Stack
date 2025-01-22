// Write a program to get the number of occurance of a specified element in an array
import java.util.Scanner;

public class QueAOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Input the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to count
        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();

        // Count the occurrences of the specified element
        int count = 0;
        for (int num : array) {
            if (num == elementToCount) {
                count++;
            }
        }

        // Output the result
        System.out.println("The element " + elementToCount + " occurs " + count + " times in the array.");
    }
}
