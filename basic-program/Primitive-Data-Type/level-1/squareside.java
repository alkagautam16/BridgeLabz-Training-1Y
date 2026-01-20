


    import java.util.Scanner;

public class squareside {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side of the square
        double side = perimeter / 4;

        // Display output
        System.out.println(
            "The length of the side is " + side + " whose perimeter is " + perimeter
        );

        input.close();
    }
}


