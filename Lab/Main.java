// /*

//  In Java, static variables and methods belong to the class rather than any particular instance of the class. Here's a simple breakdown of static variables and methods, along with access modifiers:
// Static Variable
// A static variable is shared among all instances of a class. It is initialized only once and retains its value across all instances.
//  */

//   class Example 
// {
//     static int staticVar = 0; 

//     public void increment() 
//     {
//         staticVar++;
//     }

//     public static void display() 
//     {
//         System.out.println("Static variable: " + staticVar);
//     }
// }

// public class static_var_and_method
// {
//     public static void main(String[] args) 
//     {
//         Example obj1 = new Example();
//         Example obj2 = new Example();
//         Example obj3 = new Example();


//         obj1.increment();
//         obj2.increment();
//         obj3.increment();
//         Example.display();
//     }
// }
// static method 
 class Example 
 {
    static int staticVar = 0; // Static variable

    static void staticMethod() 
    {
        staticVar++; // Can access static variable
        System.out.println("Static variable inside static method: " + staticVar);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Example.staticMethod(); 
    }
}
