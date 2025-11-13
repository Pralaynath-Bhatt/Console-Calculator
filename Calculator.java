import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        System.out.println("===== Console Calculator =====");

        // Infinite loop until user exits
        while (true) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        System.out.println("Error: Division by zero!");
                        valid = false;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    valid = false;
                    break;
            }

            if (valid) {
                System.out.println("Result = " + result);
            }

            // Ask if user wants to continue or exit
            System.out.print("\nPress 'q' to quit or any other key to continue: ");
            choice = sc.next().charAt(0);
            if (choice == 'q' || choice == 'Q') {
                System.out.println("Calculator closed. Goodbye!");
                break;
            }
        }

        sc.close();
    }
}
