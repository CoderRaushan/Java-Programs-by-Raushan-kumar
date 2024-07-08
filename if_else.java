import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        int password;
        System.out.println("Enter your password:");
        Scanner s = new Scanner(System.in);
        password = s.nextInt();
        if (password == 1234) {
            System.out.println("Name:Raushan kumar\nCRN:2217063\nURN:2203751\nBranch:ECE(A2)");
        } else {
            System.out.println("wrong password!");
        }

    }
}
