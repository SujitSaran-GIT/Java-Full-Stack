// 5.	Write a program to find a pair with the highest product from a given array of integers.
// Original array: [1, 2, 3, 4, 7, 0, 8, 4]
// Maximum product pair is: (7, 8)


public class QueEFive {
    public static void main(String[] args) {
        // Define the original array
        int[] array = {1, 2, 3, 4, 7, 0, 8, 4};

        // Print the original array
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the pair with the maximum product
        int[] maxProductPair = findMaxProductPair(array);

        // Print the result
        if (maxProductPair != null) {
            System.out.println("Maximum product pair is: (" + maxProductPair[0] + ", " + maxProductPair[1] + ")");
        } else {
            System.out.println("No valid pair found.");
        }
    }

    // User-defined function to find the pair with the maximum product
    public static int[] findMaxProductPair(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        System.out.println(maxProduct);
        int[] result = new int[2];

        // Iterate through the array to find the pair with the maximum product
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int product = array[i] * array[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }

        // Return the pair with the maximum product
        return result;
    }
}
