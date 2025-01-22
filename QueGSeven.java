public class QueGSeven {
    public static void main(String[] args) {
        // Define the original array
        int[] array = {10, 11, 12, 13, 14, 16, 17, 18, 19, 20};

        // Find the missing number using a user-defined function
        int missingNumber = findMissingNumber(array, 10, 20);

        // Print the original array
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the missing number
        System.out.println("Missing number in the said array (10-20): " + missingNumber);

        // Create the new array with the missing number
        int[] newArray = createNewArray(array, missingNumber);

        // Print the new array
        System.out.print("New array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // User-defined function to find the missing number
    public static int findMissingNumber(int[] array, int start, int end) {
        int totalSum = 0;
        int arraySum = 0;

        // Calculate the sum of numbers from start to end
        for (int i = start; i <= end; i++) {
            totalSum += i;
        }

        // Calculate the sum of numbers in the array
        for (int num : array) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    // User-defined function to create a new array with the missing number
    public static int[] createNewArray(int[] array, int missingNumber) {
        int[] newArray = new int[array.length + 1];
        int index = 0;

        // Insert numbers into the new array in sorted order
        for (int num : array) {
            if (num > missingNumber && index == 0) {
                newArray[index++] = missingNumber;
            }
            newArray[index++] = num;
        }
        if (index == array.length) {
            newArray[index] = missingNumber;
        }

        return newArray;
    }
}
