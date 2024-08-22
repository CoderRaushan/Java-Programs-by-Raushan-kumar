import java.util.Scanner;

public class nested_if_else {
  public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your 12th marks in percentage:");
    a = sc.nextInt();
    if (a >= 70) {
      if (a >= 85) {
        System.out.println("you got IT branch");
      } else {
        System.out.println(" you got ECE branch");
      }
    } else {
      if (a >= 60 && a < 70) {
        System.out.println("you got CE branch ");
      } else {
        System.out.println("you got machanical branch");
      }
       sc.close();
    }
  }
}