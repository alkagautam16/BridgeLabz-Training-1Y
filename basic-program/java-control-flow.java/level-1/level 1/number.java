import java.util.*;
public class number {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a natural number");
        int number = sc.nextInt();
       
        if (number>=1){
            for(int i = 1;i<=12;i++){
                System.out.println("the natutal number is "+number);
            }
        }
    }
}
