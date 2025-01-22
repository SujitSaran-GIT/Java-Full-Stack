import java.util.Scanner;

public class Practise {
    public static void printArray(int[] array){
        System.out.println("Printing the array");
        for (int num : array) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void occuranceNumber(int[] array,int elementToCount){
        // Write a program to get the number of occurance of a specified element in an array
        int count = 0;
        for (int num : array) {
            if (num == elementToCount) {
                count++;
            }
        }
        System.out.println(elementToCount+" occurs for "+count+" times");
    }
    public static void insertBeforeSecondElement(int array[],int newElement,int newArray[]){
        // Write a program to insert a newly created item before the second element in an exsiting array
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i==1) {
                newArray[i] = newElement;
            }else{
                newArray[i] = array[j];
                j++;
            }
        }
        printArray(newArray);
    }
    public static void removeSpecifiedElement(int[] array,int[] newArrayAfterRemove,int elementToRemove){
        // Write a program to remove the first occurance of a specified element from an array
        int index = -1;
        for (int i = 0;i<array.length;i++) {
            if (array[i] == elementToRemove) {
                index = i;
                break;
            }
        }
        // If the element is not found, return the original array
        if (index == -1) {
            System.out.println("Element not found in the array.");
            printArray(array);
        }
        // Copy elements to the new array, skipping the specified element
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArrayAfterRemove[j++] = array[i];
            }
        }
        printArray(newArrayAfterRemove);
    }
    public static void maximumProductPair(int[] array,int[] productPair){
        // Write a program to find a pair with the highest product from a given array of integers.
        // Original array: [1, 2, 3, 4, 7, 0, 8, 4]
        // Maximum product pair is: (7, 8)
        int maxProduct = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int product = array[i]*array[j];
                if (product>maxProduct) {
                    maxProduct = product;
                    productPair[0] = array[i];
                    productPair[1] = array[j];
                }
            }
        }
        System.out.println("Printing the new array");
        printArray(productPair);
    }
    public static int[] removeDuplicates(int[] array){
        // Write a  program that removes all duplicate elements from an array and returns a new array.
        // Sample Output:
        // Original array: 1 3 5 1 3 7 9
        // After removing duplicate elements from the said array: 1 3 5 7 9
        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10,20,30,40,30,20,10,50};
        printArray(array);
        // int elementToCount = sc.nextInt();
        // QueAOne
        // occuranceNumber(array,elementToCount);
        // QueBTwo
        // int newElement = sc.nextInt();
        // int[] newArray = new int[array.length+1];
        // insertBeforeSecondElement(array, newElement, newArray);
        // QueCThree
        // int elementToRemove = sc.nextInt();
        // int[] newArrayAfterRemove = new int[array.length-1];
        // removeSpecifiedElement(array,newArrayAfterRemove,elementToRemove);
        // QueEFive
        // int[] productPair = new int[2];
        // maximumProductPair(array,productPair);
        // QueFSix
        int[] uniqueArray = removeDuplicates(array);
        printArray(uniqueArray);
    }
}
