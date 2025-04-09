import java.util.Scanner;
import java.lang.Math;
public class NaturalNumberSum
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int forlulaSum=formulaSummation( n);
		int recursionSum=recursionSummation( n);
		if(forlulaSum==recursionSum)
		{
			System.out.println("both are same , sum= "+forlulaSum);
		}
		
	}
	public static int formulaSummation(int n)
	{
		return n*(n+1)/2;
	}
	public static int recursionSummation(int n)
	{
		if(n==0) return 0;
		else return n+recursionSummation(n-1);
		
	}

	
}