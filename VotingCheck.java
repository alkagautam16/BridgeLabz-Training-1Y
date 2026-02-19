import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Define array of 10 integer elements
        int[] ages = new int[10];

        // Taking input for 10 students
        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Result:");

        // b. Loop through array and check conditions
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("The student with age " + ages[i] + " has entered an invalid age.");
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
