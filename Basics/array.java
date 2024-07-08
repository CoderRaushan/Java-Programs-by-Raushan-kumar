
public class array 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,10};
        System.out.println(a[7]);
        System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(a[5]);
        System.out.println("array element with the help of for_each loop");
        for(int b :a)
        {
            System.out.print(" " +b);
        }
    }
}
