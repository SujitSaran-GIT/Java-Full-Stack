// write a program to remove first occurance of a specified element from an array

import java.util.Arrays;

public class Demo{
    public static void main(String[] args) {
        int[] originalArray = {10,20,30,10,40,50,20};
        System.out.println("Original Array:"+Arrays.toString(originalArray));
        int element = 10;
        int[] newArray = removeElement(originalArray,element);
        System.out.println("New array:"+Arrays.toString(newArray));
    }
    public static int[] removeElement(int[] originalArray,int element){
        int[] newArray = new int[originalArray.length-1];
        // if element is present
        for (int i = 0; i < newArray.length; i++) {
            if (originalArray[i]==element) {
                System.out.println("Element found");
                break;
            }
        }

        // if element not present
        for (int i = 0; i < newArray.length; i++) {
            if (originalArray[i]!=element) {
                System.out.println("Can't find the element");
                return originalArray;
            }
        }

        // if the element is present then remove the element
        for (int i = 0,j=0; i < newArray.length; i++) {
            if (originalArray[i]==element) {
                System.out.println("Element found");
                newArray[j++]=originalArray[i];
                
            }
        }

        return newArray;
    }
}