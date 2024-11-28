// Custom Exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);  // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Handling ArithmeticException
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);  // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        // Handling NullPointerException
        try {
            String str = null;
            System.out.println(str.length());  // Null reference access
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        // Handling User-defined Exception
        try {
            throw new MyCustomException("This is a user-defined exception!");
        } catch (MyCustomException e) {
            System.out.println("MyCustomException caught: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }
}
