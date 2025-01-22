import java.util.Scanner;

public class MatrixMultiplication {
    public static void arrayInput(int col,int row,int array[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter the element at position (" + i + ", " + j + "): ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the array elements");
        printArray(col, row, array);
    }
    public static void printArray(int col,int row,int array[][]){
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void resultMatrix(int col,int row,int matrixArray[][],int arrayOne[][],int arrayTwo[][]){
        System.out.println("Resultant Matrix");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrixArray[i][j] = 0;
                for (int k = 0; k < col; k++) {
                    matrixArray[i][j] += arrayOne[i][k]*arrayTwo[k][j];
                }
            }
        }
        printArray(col, row, matrixArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of column:");
        int col = sc.nextInt();
        System.out.print("Enter the size of column:");
        int row = sc.nextInt();
        int[][] arrayOne = new int[col][row];
        int[][] arrayTwo = new int[col][row];
        // Input the array elements
        System.out.println("Input the array elements");
        System.out.println("Input the elements inside the first array");
        arrayInput(col,row,arrayOne);
        System.out.println("Input the elements inside the fisrt array");
        arrayInput(col, row, arrayTwo);

        //  Creating another matrix to store the multiplication of two matrices
        int[][] matrixArray = new int[col][row];
        resultMatrix(col,row,matrixArray,arrayOne,arrayTwo);
    }
}
