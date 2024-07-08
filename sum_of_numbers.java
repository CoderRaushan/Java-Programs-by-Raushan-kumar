import java.util.Scanner;
public class sum_of_numbers 
{
    public static void main(String[] args) 
    {  int num,sum=0;
        System.out.println("Enter your number how many times do you want add numbers:");
        Scanner s= new Scanner(System.in);
        num=s.nextInt();
        System.out.println("Enter your number");
        for(int i=0;i<num;i++)
        { 
            int b=s.nextInt();
            sum=sum+b ;
        System.out.println("the sum is"+sum);
        }
      
    }
}
