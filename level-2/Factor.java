import java.util.Scanner;
import java.lang.Math;
public class Factor
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int factors[]=findingFactors(n);
		int sum=factorsSummation(factors);
		int product=factorProduct(factors);
		long squaresSum=sumOfSquares(factors);
		System.out.println("factors are:");
		for(int i=0;i<factors.length;i++)
		{
			System.out.println(factors[i]);
		}
		System.out.println("sum:"+sum);
		System.out.println("product:"+product);
		System.out.println("square factors:"+squaresSum);
	}
	public static int[] findingFactors(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) count++;
		}
		int factors[]=new int[count];
		int index=0;
		
		for(int i=1;i<=n;i++)
		{
		   if(n%i==0) 
		   {	factors[index]=i;
				index++;
		   }
		}
		return factors;
	}
	public static int factorsSummation(int factors[])
	{
		int sum=0;
		for(int i=0;i<factors.length;i++)
		{
			sum+=factors[i];
		}
		return sum;
	}
	public static int factorProduct(int factors[])
	{
		int product=1;
		for(int i=0;i<factors.length;i++)
		{
			product*=factors[i];
		}
		return product;
		
	}
	public static long sumOfSquares(int factors[])
	{
		long squaresSum=0;
		for(int i=0;i<factors.length;i++)
		{
			squaresSum+=Math.pow(factors[i],2);
		}
		
		return squaresSum;
	}
	
}