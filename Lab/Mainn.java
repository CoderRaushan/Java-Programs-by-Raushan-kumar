
interface OuterInterface 
{
    void outerMethod();


    interface InnerInterface 
    {
        void innerMethod();
    }
}


class OuterClass implements OuterInterface 
{
    public void outerMethod() 
    {
        System.out.println("Outer interface method");
    }
}


class InnerClass implements OuterInterface.InnerInterface
{
    public void innerMethod() 
    {
        System.out.println("Inner interface method");
    }
}

public class Mainn 
{
    public static void main(String[] args) 
    {
        OuterInterface outer = new OuterClass();
        OuterInterface.InnerInterface inner = new InnerClass();
        // outer.outerMethod();
        inner.innerMethod();
    }
}