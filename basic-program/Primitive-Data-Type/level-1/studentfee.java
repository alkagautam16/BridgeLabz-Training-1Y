


    import java.util.Scanner;

public class studentfee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Print output
        System.out.println(
            "The discount amount is INR " + discount + 
            " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}


