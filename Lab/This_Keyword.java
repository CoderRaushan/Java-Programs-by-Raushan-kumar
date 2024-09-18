// public class This_Keyword {
//     void fun()
//     {
//         System.out.println(this);
//     }
//     public static void main(String[] args) 
//     {
//         This_Keyword t=new This_Keyword();
//         t.fun(); //output will be : This_Keyword@4f2410ac refering to the current object
//     }
// }


public class This_Keyword {
    void fun1()
    {
        System.out.println("hi i am fun1");
    }
    void fun2()
    {
       this.fun1();
    }
    public static void main(String[] args) 
    {
        This_Keyword t=new This_Keyword();
        t.fun2(); 
    }
}
