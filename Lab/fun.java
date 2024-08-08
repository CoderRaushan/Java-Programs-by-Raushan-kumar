
import java.util.Scanner;
class fun
{	int a, b, add, sub, mul, div;
	public static void main(String[] args)
	{
		    fun ref=new fun();
 	    	ref.input();
	    	ref.process();
	    	ref.output();
	    	fun.show();
	}
void input()
{	Scanner text=new Scanner(System.in);
	System.out.println("enter the number");
	a=text.nextInt();
	b=text.nextInt();
	text.close();
}

void process()
{	add=a+b;
	sub=a-b;
	mul=a*b;
	div=a/b;
}
void output()
{	System.out.println("Addition of a and b " +add);
	System.out.println("Subtraction of a and b " +sub);
	System.out.println("Multiplication of a and b " +mul);
	System.out.println("Division of a and b " +div);
}
public static void show()
{
	System.out.println("Program run successfully");
}
}