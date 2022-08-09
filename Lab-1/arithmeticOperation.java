class arithmeticOperation {
    public static void main(String[] args) {
        float firstNumber = 30;
        float secondNumber = 20;

        double additon = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double divison = firstNumber / secondNumber;
        double modulus = firstNumber % secondNumber;
        System.out.println(additon);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(divison);
        System.out.println(modulus);

        firstNumber = 15;
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        }
    }
}