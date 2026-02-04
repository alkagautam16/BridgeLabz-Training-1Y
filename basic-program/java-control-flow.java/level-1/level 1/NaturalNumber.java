
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter a  natural number ");
        int n = sc.nextInt();
        if (n>0){
            int sum = 0;
           


            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            System.out.println("The number is a natural number");
            System.out.println("Sum of first " + n + " natural numbers = " + sum);
        } 
        else {
            System.out.println("The number is NOT a natural number");
        }
    }
}

