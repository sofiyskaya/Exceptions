package Task1;

import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        try {
            if (num <= 0) {
                throw new InvalidNumberException("Invalid Number");
            } else {
                System.out.println("Number is valid");
            }
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

