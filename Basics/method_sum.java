import java.util.Scanner;

public class method_sum {
    public static void mysum(int d, int e) {
        int t = d + e;
        System.out.println("the sum is:" + t);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Entert your number:");
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int e = s.nextInt();
        mysum(d, e);
    }
}
