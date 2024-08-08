// import java.util.Scanner;
class itb
{
	void add()
	{	
		int a=10, b= 20;
		System.out.println("Addition of two numbers is " + (a+b) );
	} 
	public static void show()
    {
		System.out.println("Java static method");
	}
}
class Test{
	public static void main(String[] args)
    {
		itb ref=new itb();
		ref.add();
		itb.show();
	}
}