import java.util.*;
public class OddOrEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        if (num<=0){
            System.out.println(num+"please enter a natural number");
        }
            else {
                for(int i = 1;i<=num;i++){
                    if(num%2==0){ //check number is odd 
                System.out.println(num+"is even ");
            } else{
                System.out.println(num+"is odd");
            }
        }
    }
    }
}
