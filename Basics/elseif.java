import java.util.Scanner;
public class elseif 
{  
    public static void main(String[] args)
    {   int a,b,c;
        System.out.println("Enter three numbers:");
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greatest number");
        }
        else if(b>c && b>a)
        {
            System.out.println("b is greatest number");
        }
        else
        {
            System.out.println("c is grestest number");
        }
        s.close();
    }
}
