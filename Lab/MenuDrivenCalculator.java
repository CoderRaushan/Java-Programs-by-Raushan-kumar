import java.util.Scanner;
class methods {
    static int Addition(int x, int y) {
        return (x + y);
    }
    static int Subtraction(int x, int y) {
        return (x - y);
    }
    static int Multiplication(int x, int y) {
        return (x * y);
    }
    static int Division(int x, int y) {
        return (x / y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + Addition(num1, num2));
                    break;

                case 2:
                    // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + Subtraction(num1, num2));
                    break;

                case 3:
                    // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + Multiplication(num1, num2));
                    break;

                case 4:
                    // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + Division(num1, num2));
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            System.out.println(); // Print an empty line for better readability
        } while (choice != 5);
        scanner.close();
    }
}


/*

 import java.util.Scanner;
class methods{
     int Addition(int x,int y)
    {
        return (x+y);
    }
     int Subtraction(int x,int y)
    {
        return (x-y);
    }
     int Multiplication(int x,int y)
    {
        return (x*y);
    }
     int Division(int x,int y)
    {
        return (x/y);
    }
}
public class MenuDrivenCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            // Perform the chosen operation
            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter first number: ");
                    int  num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    methods m=new methods();
                    System.out.println("Result: " + m.Addition(num1,num2));
                    break;
                    
                case 2:
                    // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    methods m2=new methods();
                    System.out.println("Result: " + m2.Subtraction(num1,num2));
                    break;
                    
                case 3:
                    // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    methods m3=new methods();
                    System.out.println("Result: " + m3.Multiplication(num1,num2));
                    break;
                    
                case 4:
                    // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    methods m4=new methods();
                    System.out.println("Result: " + m4.Division(num1,num2));
                    break;
                    
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            
            System.out.println(); // Print an empty line for better readability
            
        } while (choice != 5);
        scanner.close();
    }
}
 */