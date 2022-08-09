// This is optimised code
class primeNumber {
  public static void main(String[] args) {
    int n = 27;

    boolean flag = true;

    if (n <= 1) {
      flag = false;
    } else if (n == 2) {
      flag = true;
    }
    // Checking if number is divisible by 2
    else if (n % 2 == 0) {
      flag = false;
    } else {
      // Checking for odd number
      for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
          flag = false;
        }
      }
    }
    if (flag) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}
// This is not optimised code
// class primeNumber_second {
// public static void main(String[] args) {
// int n = 50;
// int counter; // to count how many times it gets divided
// for (int i = 2; i < n; i++) {
// counter = 0;
// for (int j = 1; j <= i; j++) {
// if (i % j == 0) {
// counter = counter + 1; // increases by one when it gets divided
// }
// }
// if (counter == 2) {
// System.out.println(i);
// }
// }
// }
// }