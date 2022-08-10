import java.util.Scanner;

// Write a program to find number of vowels and consonants from a input string

//  !NOTE:
// ! This program counts repetitive vowels and consonants also 
// TODO: needs optimisation

public class findVowels {

    public static void main(String[] args) {

        Scanner sentance = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sentance.nextLine(); // use to take String Input

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                consonants++;
            }
        }

        System.out.println("There are " + vowels + " vowels");
        System.out.println("There are " + consonants + " consonants");

        sentance.close();
    }

}
