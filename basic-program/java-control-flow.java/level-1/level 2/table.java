import java.util.*;

public class table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an nmbere ");
        int table = sc.nextInt();
        for(int i = 6;i<=9;i++){
            System.out.println(table+"*"+i+"="+(table*i));
        }

    }
}
