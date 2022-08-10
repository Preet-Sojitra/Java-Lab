public class bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        // Bitwise AND
        System.out.print("Bitwise AND of a and b is: ");
        System.out.println(a & b);

        // Bitwise Or
        System.out.print("Bitwise OR of a and b is: ");
        System.out.println(a | b);

        // Bitwise XOR
        System.out.print("Bitwise XOR of a and b is: ");
        System.out.println((a ^ b));

        // Bitwise Complement
        System.out.print("Bitwise Complement of a is: ");
        System.out.println(~a);

        // Shift left
        System.out.print("Shift left of a and b is: ");
        System.out.println(a << 2);

        // Shift right
        System.out.print("Shift right of a and b is: ");
        System.out.println(a >> 2);
    }
}
