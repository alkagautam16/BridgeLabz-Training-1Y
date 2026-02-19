


    import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // c. Arrays for bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Taking input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and years.");
                i--; // Decrement index to re-enter data
                continue;
            }
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            totalOldSalary += salary[i];

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;   // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // f. Print results
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}


