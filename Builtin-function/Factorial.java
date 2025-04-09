import java.util.Scanner;
import java.lang.Math;
public class Factorial
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int result=fact(n);
		System.out.println("factorial of "+n+": "+result);
	}
	

	public static int  fact(int n)
	{
		if(n==1) return 1;
		if(n==0) return 1;
		else 
			return fact(n-1)*n;
	}
	
}