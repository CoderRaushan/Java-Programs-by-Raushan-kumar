import java.util.Scanner;
public class ifcondition
{
  public static void main(String[] args)
    {
      int password;
      System.out.println("enter password:");
       Scanner s = new Scanner(System.in);
       password=s.nextInt();
       if(password == 1234) 
       {
        System.out.println("Name:Raushan kumar\nCRN:2217063\nURN:2203751\nBranch:ECE(A2)");
       }
       s.close();
    }
}
