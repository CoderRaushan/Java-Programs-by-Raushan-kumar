public class diff_classes 
{
    void add()
	{	
		int a=10, b=20;
		System.out.println("Addition of two numbers is " + (a+b) );
	} 
	void show()
    {
		System.out.println("Java static method");
	}
}
class newclass
{
	void sub()
	{	
		int a=10, b= 20;
		System.out.println("subtraction of two numbers is " + (a-b) );
	} 
}

class parent
{
	public static void main(String[] args) 
	{
		diff_classes dref=new diff_classes();
		newclass nref=new newclass();
		dref.add();
		dref.show();
		nref.sub();
	}
} 