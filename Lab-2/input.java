import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // For taking input
        Scanner ob = new Scanner(System.in); // "new" dynamically allocates memory
        System.out.print("Please enter A: ");
        int a = ob.nextInt();
        System.out.print("Please enter B: ");
        int b = ob.nextInt();
        System.out.print("Please enter C: ");
        float c = ob.nextFloat();
        System.out.println("A is: " + a);
        System.out.println("B is: " + b);
        System.out.println("C is: " + c);
        ob.close();
    }
}
