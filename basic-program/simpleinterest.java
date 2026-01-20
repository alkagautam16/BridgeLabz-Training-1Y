
    import java.util.Scanner;
public class simpleinterest {
   public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal :");
        float Principal=sc.nextFloat();

        System.out.println("Enter Rate Of Interest(%) :");
        float Rate=sc.nextFloat();

        System.out.println("Enter Time(Years) :");
        float Time=sc.nextFloat();

        System.out.println("Your Total Interest is : "+(Principal*Rate*Time));
        sc.close();
    }
}
    

