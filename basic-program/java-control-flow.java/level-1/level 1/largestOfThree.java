
import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Ist number");
        int a = sc.nextInt();
        System.out.println("enter a IInd number");
        int b = sc.nextInt();
        System.out.println("enter a IIrd number");
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("Ist number is largest"+ a);
        } else if(b>a&&b>c){
            System.out.println("IInd number is largest"+b);
        } else if (c>a&&c>b){
            System.out.println("IIrd number is largest"+c);
        } else {
            System.out.println("all are equal");
        }
        

        
        
    }
}
