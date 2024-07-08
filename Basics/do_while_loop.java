import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) 
    { int x;
        System.out.print("enter a number:");
        Scanner s= new Scanner(System.in);
        x=s.nextInt();
        do
        {
         System.out.println(x);
            ++x;
        }
        while(x<=100);
    }
}
