import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        System.out.println("Enter the value of a,b,c:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int r = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(r);
    }
}
