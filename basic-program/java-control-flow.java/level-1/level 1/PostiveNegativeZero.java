import java.util.*;
public class PostiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number ");
        int num = sc.nextInt();
        if (num>0){
            System.err.println("Number is postive");
        }else if (num<0){
            System.err.println("Number is negative");
        }else{
            System.err.println("Number is zero");
        }

        
    }
    
}
