import java.util.Scanner;

public class Main {
    public static void insertArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the "+i+" th element:");
            array[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] array){
        for (int num : array) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void occuranceNumber(int[] array, int number){
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        System.out.println("The "+number+" occurs for "+count+" times");
    }
    public static void insertBeforeSecondElement(int[] array,int insertNumber){
        int length  = array.length;
        int[] newArray = new int[length+1];
    
        for (int i = 0,j = 0; i < newArray.length; i++) {
            if (i == 1) {
                newArray[i] = insertNumber;
            }else{
                newArray[i] = array[j];
                j++;
            }
        }
        printArray(newArray);
    }
    public static void removeFirstOccurrence(int[] array,int element){
        int[] newArray = new int[array.length-1];
        int index = -1;
        // Find the index of the first occurrence
        for (int i = 0; i < newArray.length; i++) {
            if (array[i]==element) {
                index = i;
                break;
            }
        }
        // If the element is not found, return the original array
        if (index == -1) {
            System.out.println("Element not found inthe array");
            printArray(array);
        }
        // Copy elements to the new array, skipping the specified element
        for (int i = 0 , j = 0; i < newArray.length; i++) {
            if (i != index) {
                newArray[j+1] = array[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements:");
        int size = sc.nextInt();
        int[] array = new int[size];
        insertArray(array);
        printArray(array);
        // Write a program to get the number of occurance of a specified element in an array
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        occuranceNumber(array,number);

        // Write a program to insert a newly created item before the second element in an exsiting array
        System.out.println("Enter the number to insert:");
        int insertNumber = sc.nextInt();
        insertBeforeSecondElement(array,insertNumber);

        // Write a program to remove the first occurance of a specified element from an array
        System.out.println("Enter the number to remove:");
        int element = sc.nextInt();
        removeFirstOccurrence(array,element);
    }
}