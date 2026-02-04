import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Eneter a  age");
        int age = sc.nextInt();
        if (age>=18){
            System.err.println("the person can vote");
        } else{
            System.err.println("the person cannot vote");
        }

        
    }
}