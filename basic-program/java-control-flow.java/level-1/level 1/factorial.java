import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a factorial number");//input by user
        int number = sc.nextInt();
        if (number<0){
            System.out.println("please enetr a postive value ");

        }else{
            int factorial = 1;
            int i = 1;
        while(i<=number){
          factorial =  factorial * i;
          i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        
          


        }
    }
}
