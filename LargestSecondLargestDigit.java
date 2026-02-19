
    import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert to positive if negative
        if (number < 0) {
            number = -number;
        }

        // b. Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d & e. Extract digits and store in array
        while (number != 0) {

            digits[index] = number % 10;  // Remove last digit
            number = number / 10;         // Remove digit from number

            index++;

            // f. Stop if array size reached
            if (index == maxDigit) {
                break;
            }
        }

        // g. Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        sc.close();
    }
}


