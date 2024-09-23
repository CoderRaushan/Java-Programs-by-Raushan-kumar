abstract class clsss_abs 
{
    // abstract funtion
    abstract void fun();

    // normal funtion
    void fun1() {
        System.err.println("helooo main hu normal fun :");
    }

}
 class classb extends clsss_abs 
 {
    @Override
    void fun() 
    {
        System.err.println("helooo main hu abstract fun :");
    }

    public static void main(String[] args) {
        clsss_abs obj = new classb();
        obj.fun();
        obj.fun1();
    }
}
