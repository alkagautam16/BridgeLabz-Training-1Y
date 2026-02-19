
    import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        int temp = number;

        // b. Count digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // If number is 0
        if (count == 0) {
            count = 1;
        }

        // c. Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // d. Create reverse array
        int[] reverseArray = new int[count];

        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }

        // e. Display reversed number
        System.out.print("Reversed number: ");

        if (isNegative) {
            System.out.print("-");
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i]);
        }

        sc.close();
    }
}


