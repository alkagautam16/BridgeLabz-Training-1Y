


    import java.util.Scanner;

public class triangle { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        
        double areaInches = 0.5 * base * height;

        
        double areaCm = areaInches * Math.pow(2.54, 2);

        
        System.out.println(
            "The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters."
        );

        input.close();
    }
}


