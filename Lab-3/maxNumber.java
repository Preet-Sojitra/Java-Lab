import java.util.Scanner;

public class maxNumber {

    // Using conditionals to find maximum of three numbers
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = number.nextInt();
        System.out.print("Enter second number: ");
        int b = number.nextInt();
        System.out.print("Enter third number: ");
        int c = number.nextInt();

        // int a = 30, b = 15, c = 100;

        if (a > b && a > c) {
            System.out.println(a + " is Maximum");
        } else if (b > c) {
            System.out.println(b + " is Maximum");
        } else {
            System.out.println(c + " is Maximum");
        }
        number.close();
    }
}
