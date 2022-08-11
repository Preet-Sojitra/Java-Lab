import java.util.Scanner;

public class capitalLetters {
    // Scan one line and display the words starting with capital letters

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = string.nextLine();

        System.out.println("Capital letters in string are: ");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i) + " ");
            }
        }

        // System.out.println(str);

        string.close();
    }

}
