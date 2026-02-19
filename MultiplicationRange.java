
    import java.util.Scanner;

public class MultiplicationRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results from 6 to 9 (4 values)
        int[] multiplicationResult = new int[4];

        // b. Loop from 6 to 9 and store results
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display result in required format
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}


