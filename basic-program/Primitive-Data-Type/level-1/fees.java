

public class fees {
    
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        System.out.println(
            "The original fee is INR " + fee + "\n" +
            "The discount amount is INR " + discount + "\n" +
            "The fee to be paid after discount is INR " + discountedFee
        );
    }
}

    

