
interface A {
     void fun();

     default void disp() 
     {
          System.out.println("i am default interface method after jdk 1.8v");
     };
}

class B implements A {
     @Override
     public void fun() {
          System.out.println("abc");
     }

}

class C implements A {
     @Override
     public void fun() {
          System.out.println("def");
     }
}

class D implements A {
     @Override
     public void fun() {
          System.out.println("ght");
     }
}

public class DefaultIntefaceMethod {
     public static void main(String[] args) {
          B b = new B();
          b.fun();
          D d = new D();
          d.fun();
          d.disp();
     }
}