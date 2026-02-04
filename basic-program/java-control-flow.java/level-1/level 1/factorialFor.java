
    import java.util.Scanner;

    public class factorialFor {

   }

   public static void main(String[] var0) {
      


    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        // Check for natural number
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }



