import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number");
        int number = sc.nextInt();
        System.out.println("enter a power");
        int power= sc.nextInt();
         int result = 1;
         int counter = 0 ;
         while(counter<power){
            result = result*number ;
            counter ++;

         }

        System.out.println(number + " raised to the power " + power+ " is: " + result);
    }
    }

