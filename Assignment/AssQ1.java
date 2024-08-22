import java.util.Scanner;
public class AssQ1
{

    public static boolean checkVariables(double x)
    {
         if(x<1 && x>0)
         {
            return true;
         }
         else 
         {
            return false;
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a=sc.nextDouble();
        System.out.print("Enter the first number: ");
        double b=sc.nextDouble();
        sc.close();
        if((checkVariables(a) && checkVariables(b)))
        {
            System.out.println("Variables are in between value 1:"); 
        }
        else 
        {
            System.out.println("Variables are not in between value 1:");
        }
    }
};