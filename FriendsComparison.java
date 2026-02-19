
    import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // a. Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // b. Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // c. Display results
        System.out.println("\nYoungest friend is: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend is: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}


