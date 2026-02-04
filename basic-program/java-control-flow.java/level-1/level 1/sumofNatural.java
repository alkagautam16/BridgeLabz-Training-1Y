
  import java.util.Scanner;

public class sumofNatural { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n > 0) {

            // Sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The results are not equal.");
            }

        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
    }
}


