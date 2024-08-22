import java.util.Scanner;
public class for_loop
{
    public static void main(String[] args)
    {
        int i,x;
        System.out.print("Enter any number:");
        Scanner S=new Scanner (System.in);
        x=S.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(x*i);
        }
        S.close();
    }
}
