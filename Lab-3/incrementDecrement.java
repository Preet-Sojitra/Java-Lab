public class incrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a after pre-increment is: " + (++a)); // Here "a" becomes 11
        System.out.println("a after post-increment is: " + (a++)); // Here a = 11 and then incement happens
        System.out.println("b after pre-decrement is: " + (--b));
        System.out.println("b after post-decrement is: " + (b--));
    }
}
