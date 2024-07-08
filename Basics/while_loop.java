import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int x;
        System.out.print("Enter any number:");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while (x <= 100)
        {
            System.out.println(x);
            x++;
        }
    }
}
