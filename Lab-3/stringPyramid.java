import java.util.Scanner;

public class stringPyramid {
    // Scan one sting and create pyramid from that string, create pyramid of the
    // size of length of string
    // Eg: if string is "string"
    // Then output should go like this:
    // s
    // s t
    // s t r
    // s t r i
    // s t r i n
    // s t r i n g

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = string.nextLine();

        for (int i = 0; i <= str.length(); i++) {

            for (int j = i; j < str.length(); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println("");
        }
        string.close();
    }
}
