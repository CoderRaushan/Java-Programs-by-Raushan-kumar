import java.util.Scanner;
public class input 
{
    public static void main(String[] args) 
    {
        System.out.println("enter your name:");
        Scanner str=new Scanner(System.in);
        String name=str.nextLine();
        System.out.println(name);
        str.close();
    }
}
