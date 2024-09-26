class OuterClass 
{
    static int outerX = 10;
    private String name="Raushan";
    int outerY = 20;
    static class StaticNestedClass 
    {

        void display() 
        {
            System.out.println("Static variable from outer class: " + outerX);
            OuterClass outer = new OuterClass();
            System.out.println("Non statis variable from outer class: " + outer.outerY);
            System.out.println("Peivate variable from outer class: " + outer.name);
        }
    }
    public static void main(String[] args) 
    {
        StaticNestedClass nestedClass = new StaticNestedClass();
        nestedClass.display();
    }
}