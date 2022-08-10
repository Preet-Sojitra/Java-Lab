import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {

        int n;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = number.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        number.close();
    }
}
