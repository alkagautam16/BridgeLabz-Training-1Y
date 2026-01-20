


    import java.util.Scanner;
public class distancecoverterfeet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();

        
        double distanceYards = distanceFeet / 3;

       
        double distanceMiles = distanceYards / 1760;

       
        System.out.println(
            "The distance of " + distanceFeet + " feet is " + distanceYards + " yards and " + distanceMiles + " miles."
        );

        input.close();
    }
}

