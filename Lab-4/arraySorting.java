import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {
        // int numbers[] = { 2, 1, 4, 3, 5 };

        Scanner arraySize = new Scanner(System.in); // Taking size of array
        Scanner enterNumbers = new Scanner(System.in); // Taking user input

        System.out.print("Enter size of array: ");
        int numbers[] = new int[arraySize.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter %d number: ", i + 1);
            numbers[i] = enterNumbers.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int k = 0;
                if (numbers[j] < numbers[j + 1]) {
                    continue;
                } else {
                    k = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = k;
                }
            }
        }
        System.out.print("Sorted Array is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        arraySize.close();
        enterNumbers.close();
    }
}
