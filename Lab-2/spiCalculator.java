import java.util.Scanner;

// impement grading system
public class spiCalculator {
    // Enter marks and credits of 2 subjects
    // SPI: ((gradeSubje1 * credits1) + (gradesubject2 * credits2)) / total credits
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        // Subject-1
        System.out.print("Please enter marks of subject 1: ");
        float marks1 = marks.nextFloat();
        System.out.print("Please enter credits of subject 1: ");
        int credits1 = marks.nextInt();

        // Subject-2
        System.out.print("Please credits marks of subject 2: ");
        float marks2 = marks.nextFloat();
        System.out.print("Please enter credits of subject 2: ");
        int credits2 = marks.nextInt();

        // Grade Points for subject-1
        int gradePoints1 = 0;
        if (marks1 >= 80) {
            gradePoints1 = 10;
        } else if (70 <= marks1 && marks1 <= 79) {
            gradePoints1 = 8;
        } else if (60 <= marks1 && marks1 <= 69) {
            gradePoints1 = 6;
        } else if (50 <= marks1 && marks1 <= 59) {
            gradePoints1 = 5;
        } else if (marks1 <= 49) {
            gradePoints1 = 4;
        }

        // Grade Points for subject-2
        int gradePoints2 = 0;
        if (marks2 >= 80) {
            gradePoints2 = 10;
        } else if (70 <= marks2 && marks2 <= 79) {
            gradePoints2 = 8;
        } else if (60 <= marks2 && marks2 <= 69) {
            gradePoints2 = 6;
        } else if (50 <= marks2 && marks2 <= 59) {
            gradePoints2 = 5;
        } else if (marks2 <= 49) {
            gradePoints2 = 4;
        }
        marks.close();

        float totalCredits = credits1 + credits2;

        float spi = (float) (((gradePoints1 * credits1) + (gradePoints2 * credits2)) / totalCredits);

        System.out.println("SPI is: " + spi);
    }
}
