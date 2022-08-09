import java.util.Scanner;

// impement grading system
public class gradingSystem {
    // Enter marks and credits of 2 subjects
    // SPI: ((gradeSubje1 * credits1) + (gradesubject2 * credits2)) / total credits
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        System.out.print("Please enter marks of subject 1: ");
        float marks1 = marks.nextFloat();

        if (marks1 >= 80) {
            System.out.println("Grade is O");
        } else if (70 <= marks1 && marks1 <= 79) {
            System.out.println("Grade is A+");
        } else if (60 <= marks1 && marks1 <= 69) {
            System.out.println("Grade is A");
        } else if (50 <= marks1 && marks1 <= 59) {
            System.out.println("Grade is B");
        } else if (marks1 <= 49) {
            System.out.println("Grade is F");
        }
        marks.close();
    }
}
