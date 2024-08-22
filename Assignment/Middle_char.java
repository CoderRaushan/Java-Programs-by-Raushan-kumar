import java.util.Scanner;
public class Middle_char 
{
   public static char middleChar(String s)
   {
      int n=s.length();
      return s.charAt(n/2);
   }
 public static void main(String[] args) 
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any string:");
    String s=sc.nextLine();
   System.out.println(middleChar(s)); 
   sc.close();
 }
};
