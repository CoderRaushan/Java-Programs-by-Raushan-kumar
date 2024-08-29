 class inher_method {
    String color="black";
    void print()
    {
        System.out.println(color);
    }
}
 class outer_method extends inher_method 
 {
    String color="white";
    void print()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class main_method 
{
    public static void main(String[] args) 
    {
        outer_method o=new outer_method();
        o.print();
    }
    
}





