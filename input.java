
import java.util.Scanner;
public class input {
    public static void main(String[] args)
    {    System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum=a+b;
        System.out.print("the sum is:");
        System.out.println(sum);
    }
}
