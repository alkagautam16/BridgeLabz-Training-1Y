import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[][] marks = new double[n][3];  // 0=Physics, 1=Chemistry, 2=Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            double phy = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            double chem = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            double math = sc.nextDouble();

            // Validate marks
            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--;   // decrement index to re-enter data
                continue;
            }

            marks[i][0] = phy;
            marks[i][1] = chem;
            marks[i][2] = math;
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            }
            else if (percentage[i] >= 75) {
                grade[i] = "B";
            }
            else if (percentage[i] >= 60) {
                grade[i] = "C";
            }
            else if (percentage[i] >= 40) {
                grade[i] = "D";
            }
            else {
                grade[i] = "Fail";
            }
        }

        // e. Display results
        System.out.println("\n----- Student Report -----");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}

  