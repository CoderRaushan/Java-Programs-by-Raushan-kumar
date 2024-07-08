import java.util.Scanner;
public class logical_operator 
{
    public static void main(String[] args) 
    {   int a,b;
        System.out.print("Enter two number:");
       Scanner s = new Scanner(System.in); 
       a=s.nextInt();
       b=s.nextInt();
        System.out.println(a==b && a!=b);
        System.out.println(a==b || a!=b);
    }
}
