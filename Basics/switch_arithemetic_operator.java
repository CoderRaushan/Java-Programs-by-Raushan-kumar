import java.util.Scanner;
public class switch_arithemetic_operator 
{
    public static void main(String[] args)
    {
        int a, b, e, num, sub;
        float n1, n2, f, c;
        System.out.println(" no 1:addition\n no 2:odd or even\n no 3:subtraction\n no 4:multiplication\n no 5:division\nenter any number which is you want to operate:");
        Scanner s = new Scanner(System.in);
        num =s.nextInt();
        switch (num) {
            case 1:
                System.out.println("Enter two numbers");
                Scanner sc = new Scanner(System.in);
                n1 = s.nextFloat();
                n2 = s.nextFloat();
                c = n1 + n2;
                System.out.println(c);
                break;
            case 2:
                System.out.println("Enter two numbers");
                Scanner h= new Scanner(System.in);
                a = s.nextInt();
                if (a % 2 == 0)
                    System.out.println("given number is even number");
                else
                    System.out.println("given number is odd number");
                break;
            case 3:
                System.out.println("Enter two numbers");
                Scanner u = new Scanner(System.in);
                a = s.nextInt();
                b = s.nextInt();
                sub = a - b;
                System.out.println(sub);
                break;
            case 4:
                System.out.println("Enter two numbers");
                Scanner l = new Scanner(System.in);
                a = s.nextInt();
                b = s.nextInt();
                e = a * b;
                System.out.println(e);
                break;
            case 5:
                System.out.println("Enter two numbers");
                Scanner q= new Scanner(System.in);
                n1 = s.nextFloat();
                n2 = s.nextFloat();
                f = n1 / n2;
                System.out.println(f);
                break;
            default:
                System.out.println("nothiing");
        }
    }
}
