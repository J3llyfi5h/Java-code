

import java.util.Scanner;

public class EvenPalindromeNumber {

    public static boolean isPalindrome(int param) {
        String number = Integer.toString(param);
        for (int i = 0; i < number.length() / 2; i++) {
            //condition on the first digit and last and continuos on the order
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void generatePalindromes(int number) {
        int counter = 0;
        int start = 0;
        while (counter < number) {
            // calling function to use and check
            if (isPalindrome(start) && start % 2 == 0) {
                System.out.printf("%6d", start);
                counter++;
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
            start++;
        }
    }

    public static void main(String args[]) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of even palindromes you want the program to generate: ");
        number = input.nextInt();
        generatePalindromes(number);

    }
}
