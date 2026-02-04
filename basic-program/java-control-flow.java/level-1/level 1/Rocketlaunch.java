 import  java.util.*;
 public class Rocketlaunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int count = sc.nextInt();
       while (count>=1){
            System.out.println(count);
            count--;
        }
        System.out.println("launch");
    }
}
