import java.util.Scanner;
public class for_loop
{
    public static void main(String[] args)
    {
        int i,x;
        System.out.print("Enter any number:");
        Scanner s=new Scanner (System .in);
        x=s.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(x*i);
        }
    }
}
