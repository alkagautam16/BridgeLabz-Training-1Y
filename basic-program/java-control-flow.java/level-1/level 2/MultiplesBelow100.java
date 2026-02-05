
    import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Backward loop from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}


