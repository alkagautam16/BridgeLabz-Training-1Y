


 import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;

        // Handle the case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}


