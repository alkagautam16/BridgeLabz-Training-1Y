import java.util.*;
public class multiple {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check condition
        if (number > 0 && number < 100) {

            int counter = number - 1;

            System.out.println("Multiples of " + number + " are:");

            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}
