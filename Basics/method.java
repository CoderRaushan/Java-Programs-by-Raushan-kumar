import java.util.Scanner;

public class method {
    public static void myname(String n) {
        System.out.println(n);
        return;
    }

    public static void main(String[] args) 
    {
        System.out.println("Entert your name:");
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();
        myname(d);
        s.close();
    }
}
