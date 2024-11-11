public class methodOverloading 
{
    public static int add(int x,int y) 
    {
        return x+y;
    }
    public static double add(double  x,double  y) 
    {
        return x+y;
    }
    
    public static String  add(String  x,String  y) 
    {
        return x+y;
    }
public static void main(String[] args)
{
  int int_ans=add(4,4);
  double double_ans=add(1.2,2.2);
  String name=add("Raushan ","Kumar");
  System.out.println(int_ans);
  System.out.println(double_ans);
  System.out.println(name);
}
}