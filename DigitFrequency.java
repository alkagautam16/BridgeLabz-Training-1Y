
    import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Step 1: Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Step 3: Frequency array (0–9)
        int[] frequency = new int[10];

        // Step 4: Count frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}


