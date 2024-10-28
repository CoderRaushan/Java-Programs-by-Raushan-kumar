public class TryCatchExample {
    public static void main(String[] args) 
    {
        int numbers[]  = {1, 2, 3};
        try {
            System.out.println("Accessing element: " + numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
// ArrayIndexOutOfBoundsException