
    import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Array of 10 double elements and total variable
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // c. Break if 0 or negative number entered
            if (input <= 0) {
                break;
            }

            // d. Break if array is full
            if (index == 10) {
                System.out.println("Array is full (maximum 10 numbers).");
                break;
            }

            // e. Store number and increment index
            numbers[index] = input;
            index++;
        }

        // f. Loop to display values and calculate total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // g. Display total
        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}


