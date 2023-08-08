package Task2;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        try {
            if (b == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed!");
            } else {
                int result = a / b;
                System.out.println("The result of division: " + result);
            }
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
