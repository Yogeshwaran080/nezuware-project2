import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");

        while (true) {
            try {
                // Prompt the user to input two numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Prompt the user to select an operation
                System.out.println("Choose an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");

                int choice = scanner.nextInt();

                // Perform the selected operation
                switch (choice) {
                    case 1:
                        System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                        break;
                    case 2:
                        System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                        break;
                    case 3:
                        System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the calculator. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select an option between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values for numbers and valid choices for operations.");
                scanner.nextLine(); // Clear the invalid input
            }
            System.out.println(); // Add a blank line for readability
        }
    }
}
