
    import java.util.Scanner;

public class DynamicLargestSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert to positive if negative
        if (number < 0) {
            number = -number;
        }

        // Initial size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and dynamically resize if needed
        while (number != 0) {

            // If array is full, increase size by 10
            if (index == maxDigit) {

                maxDigit = maxDigit + 10; // increase size by 10

                int[] temp = new int[maxDigit];

                // Copy old data into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign new array to digits
                digits = temp;
            }

            // Store last digit
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest digit not found (all digits may be same).");
        } else {
            System.out.println("Second Largest digit: " + secondLargest);
        }

        sc.close();
    }
}


