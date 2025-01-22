// Write a program to insert a newly created item before the second element in an exsiting array

import java.util.Arrays;

public class QueBTwo {
    public static void main(String[] args) {
        int[] originalArray = {10,20,30,40,50};
        System.out.println("Original Array;"+Arrays.toString(originalArray));
        // Object obj=new Object();
        // Class s=obj.getClass();
        // System.out.println(s.getName());

        // New element to insert
        int newElement=15;
        int[] newArray = insertBeforeSecondElemet(originalArray,newElement);
        System.out.println("Array after insertion:"+Arrays.toString(newArray));
    }
    public static int[] insertBeforeSecondElemet(int[] originalArray,int newElement){
        // Create a new array with one additional size
        int[] newArray=new int[originalArray.length+1];
        // Copy elements, inserting the new element before the second position
        for (int i = 0,j=0; i < newArray.length; i++) {
            if (i==1) {
                newArray[i]=newElement;
            }else{
                newArray[i] = originalArray[j];
                j++;
            }
        }
        return newArray;
    }
}
