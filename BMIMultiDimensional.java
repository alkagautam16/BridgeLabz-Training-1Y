
    import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. Create 2D array and status array
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input for weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Weight input validation
            while (true) {
                System.out.print("Enter weight (kg): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Invalid! Please enter positive weight.");
                }
            }

            // Height input validation
            while (true) {
                System.out.print("Enter height (meters): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Invalid! Please enter positive height.");
                }
            }
        }

        // d. Calculate BMI and determine status
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            }
            else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\n---- BMI Report ----");

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}


