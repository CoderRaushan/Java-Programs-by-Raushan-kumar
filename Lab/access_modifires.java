 class Example 
 {
    public int publicVar = 1;      // Accessible from anywhere
    protected int protectedVar = 2; // Accessible within the same package and subclasses
    int defaultVar = 3;            // Accessible only within the same package
    private int privateVar = 4;    // Accessible only within this class

    public void display() 
    {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}

public class access_modifires
{
    public static void main(String[] args) 
    {
        Example example = new Example();
        example.display();
        // Accessing publicVar
        System.out.println("Access from Main: " + example.publicVar); // Accessible
        // Accessing protectedVar, defaultVar, and privateVar
        // System.out.println("Access from Main: " + example.protectedVar); // Not accessible if in a different package
        // System.out.println("Access from Main: " + example.defaultVar); // Not accessible if in a different package
        // System.out.println("Access from Main: " + example.privateVar); // Not accessible
    }
}
