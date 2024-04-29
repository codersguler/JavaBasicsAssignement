//Segbe Abdoul Aziz Diomande
//Assigment13
import java.util.Scanner;
public class Assigment13 {
        public static void main(String[] args) {
            int[] arr = {12, 45, 67, 89, 34, 56, 27};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the element to search for: ");
            int key = scanner.nextInt();
            int index = linearSearch(arr, key);
            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found in the array");
            }
        }
        public static int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1;
        }
}
//Assigment14
import java.util.Arrays;
import java.util.Scanner;
public class Assigment14 {
        public static void main(String[] args) {
            int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            System.out.println("Sorted array: " + Arrays.toString(arr));
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the element to search for: ");
            int key = scanner.nextInt();
            int index = binarySearch(arr, key);
            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found in the array");
            }
        }
        public static int binarySearch(int[] arr, int key) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
}

//Assigment15
import java.util.Scanner;
public class Assigment15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows and columns for the matrices:");
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            int[][] matrix1 = new int[rows][columns];
            int[][] matrix2 = new int[rows][columns];
            System.out.println("Enter the elements of the first matrix:");
            enterMatrixElements(scanner, matrix1);
            System.out.println("Enter the elements of the second matrix:");
            enterMatrixElements(scanner, matrix2);
            System.out.println("First matrix:");
            printMatrix(matrix1);
            System.out.println("Second matrix:");
            printMatrix(matrix2);
            int[][] sum = addMatrices(matrix1, matrix2);
            System.out.println("Sum of the matrices:");
            printMatrix(sum);
            int[][] product = multiplyMatrices(matrix1, matrix2);
            System.out.println("Product of the matrices:");
            printMatrix(product);
        }
        public static void enterMatrixElements(Scanner scanner, int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
            int[][] sum = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sum;
        }
        public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
            int rows1 = matrix1.length;
            int columns1 = matrix1[0].length;
            int columns2 = matrix2[0].length;
            int[][] product = new int[rows1][columns2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return product;
        }
}

