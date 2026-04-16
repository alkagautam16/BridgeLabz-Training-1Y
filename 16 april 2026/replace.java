public class replace {
    public static void main(String[] args) {
        int num = 102030;

        String result = String.valueOf(num).replace('0', '1');
        int newNum = Integer.parseInt(result);

        System.out.println("Updated number: " + newNum);
    }
}
