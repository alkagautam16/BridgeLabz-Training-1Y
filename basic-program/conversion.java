
    import java.util.Scanner;
    public class conversion {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp in Celcuis.");
        double a=sc.nextDouble();
        System.out.println("Temp in Fahrenheit is :"+((a*9/5)+32));
        sc.close();
    }
}
