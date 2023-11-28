/**
 * Бані, компмех, завдання 2.5, лаба 3
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Scanner;
import java.util.Random;


public class HW6__2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("n: ");
        int n = scan.nextInt();
        System.out.print("m: ");
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("метод заповнення: 1 - випадкові числа, 2 - вручну");
        int choice = scan.nextInt();
        if (choice == 1) {
            fillMatrixRandomly(matrix, n, random);
        } else {
            fillMatrixManually(matrix, scan);
        }

        System.out.println("початкова матриця:");
        printMatrix(matrix);
        
        if (n == m) {
            transposeMatrix(matrix);
            System.out.println("транспонована матриця:");
            printMatrix(matrix);
        }
    }

    private static void fillMatrixRandomly(int[][] matrix, int n, Random random) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }
    }

    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("введіть елемент [" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

