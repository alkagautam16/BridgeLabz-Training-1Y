


    import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display output
        System.out.println(
            "The maximum number of possible handshakes among " +
            numberOfStudents + " students is " + maxHandshakes
        );

        input.close();
    }
}


