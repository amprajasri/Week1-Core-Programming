import java.util.Scanner;
import java.lang.Math;
public class FibonacciSequence
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    System.out.println("Fibonacci Sequence:");
		fibonacci(n);
	}
	

	public static void fibonacci(int n)
	{
		int a=0;
		int b=1;
		int temp;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n;i++)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
	}
	
	
}