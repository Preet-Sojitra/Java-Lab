import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {

        Scanner rows = new Scanner(System.in);
        Scanner columns = new Scanner(System.in);
        Scanner numberInput = new Scanner(System.in);

        // Matrix A
        System.out.print("Enter number of rows of matrix A: ");
        int rowA = rows.nextInt();

        System.out.print("Enter number of column of matrix A: ");
        int columnA = columns.nextInt();

        int numbersA[][] = new int[rowA][columnA];

        System.out.println("\nEnter numbers of matrix A:- ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.printf("Enter (%d,%d)th number: ", i, j);
                numbersA[i][j] = numberInput.nextInt();
            }
        }

        // Matrix B
        System.out.print("\nEnter number of rows of matrix B: ");
        int rowB = rows.nextInt();

        System.out.print("Enter number of column of matrix B: ");
        int columnB = columns.nextInt();

        int numbersB[][] = new int[rowB][columnB];

        System.out.println("\nEnter numbers of matrix B:- ");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.printf("Enter (%d,%d)th number: ", i, j);
                numbersB[i][j] = numberInput.nextInt();
            }
        }

        // Answer Matrix
        int rowsAns = rowA;
        int columnsAns = columnB;

        int ans[][] = new int[rowsAns][columnsAns];

        // Multiplication
        int multiplication = 0;

        int addition = 0;

        if (columnA == rowB) {
            // System.out.println("\nMultiplication exists");

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    addition = 0;
                    for (int k = 0; k < rowB; k++) {
                        multiplication = numbersA[i][k] * numbersB[k][j];
                        addition += multiplication;
                    }
                    ans[i][j] = addition;
                }
            }

        } else {
            System.out.printf(
                    "\nMultiplication can't be done as columns of matrix A (i.e %d) is not equal to rows of matrix B (i.e %d)",
                    columnA, rowB);
        }

        // Answer
        // Answer Matrix is:
        System.out.println("\nAnswer matrix is: ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }

        /**
         * // Matrix A is:
         * System.out.println("\nMatrix A is: ");
         * for (int i = 0; i < rowA; i++) {
         * for (int j = 0; j < columnA; j++) {
         * System.out.print(numbersA[i][j] + " ");
         * }
         * System.out.println(" ");
         * }
         * 
         * // Matrix B is:
         * System.out.println("\nMatrix B is: ");
         * for (int i = 0; i < rowB; i++) {
         * for (int j = 0; j < columnB; j++) {
         * System.out.print(numbersB[i][j] + " ");
         * }
         * System.out.println(" ");
         * }
         */

        rows.close();
        columns.close();
        numberInput.close();

    }
}
