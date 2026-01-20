 import java.util.Scanner;

public class  basicc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        if(number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Display results
        System.out.println(
            "The addition, subtraction, multiplication and division value of two numbers " +
            number1 + " and " + number2 + " are: \n" +
            "Addition: " + addition + "\n" +
            "Subtraction: " + subtraction + "\n" +
            "Multiplication: " + multiplication + "\n" +
            "Division: " + (number2 != 0 ? division : "undefined")
        );

        input.close();
    }
}
