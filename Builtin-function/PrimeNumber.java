import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    int n1=input.nextInt();
		boolean isPrime=prime(n1);
		if(isPrime)
		System.out.println("it is a prime number");
		else 
		System.out.println("it is not a prime number");
	}
	

	public static boolean prime(int n)
	{
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(n)+1;i++)
		{
			if(n%i==0) 
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	
	
}