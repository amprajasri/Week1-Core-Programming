import java.util.Scanner;
import java.lang.Math;
public class  NumberCheckerFive
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int factors[]=findingFactors(n);
		int sum=factorsSummation(n);
		int product=factorProduct(n);
		long cubesprod=productOfCubes(n);
		boolean isPerfect=perfectNumber(n);
		boolean isAbundant=abundantNumber(n);
		boolean isDeficient=deficientNumber(n);
		boolean isStrong=strongNumber(n);
		System.out.println("sum:"+sum);
		System.out.println("product:"+product);
		System.out.println("product of Cubes:"+cubesprod);
		System.out.println("is perfect number:"+isPerfect);
		System.out.println("is abundant number:"+isAbundant);
		System.out.println("is deficient number:"+isDeficient);
		System.out.println("is strong number:"+isStrong);
	}
	public static int digitCount(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
            count++;
		}
		return count;
	}
	public static int[] digitsFromNumber(int n)
	{
		int count=digitCount(n);
		int digits[]=new int[count];
		int lastNumber=0,index=count-1;
		while(n>0)
		{
			lastNumber=n%10;
			digits[index]=lastNumber;
			index--;
			n=n/10;
		}
		return digits;
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
	public static int greatestFactor(int n)
	{
			int factors[]=findingFactors(n);
			return factors[factors.length-1];
	}
	public static int factorsSummation(int n)
	{
		int sum=0;
		int factors[]=findingFactors(n);
		for(int i=0;i<factors.length;i++)
		{
			sum+=factors[i];
		}
		return sum;
	}
	public static int factorProduct(int n)
	{
		int product=1;
		int factors[]=findingFactors(n);
		for(int i=0;i<factors.length;i++)
		{
			product*=factors[i];
		}
		return product;
		
	}
		public static long productOfCubes(int n)
	{
		long productCubes=1;
		int factors[]=findingFactors(n);
		for(int i=0;i<factors.length;i++)
		{
			productCubes*=(long)Math.pow(factors[i],3);
		}
		
		return productCubes;
	}
	public static boolean perfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum==n;
		
	}
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static boolean abundantNumber(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum>n;
	}
	public static boolean deficientNumber(int n)
	{
			int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum<n;
	}
	public static boolean strongNumber(int n)
	{int digits[]=digitsFromNumber(n);
	 int sum=0;
	 for(int i=0;i<digits.length;i++)
	 {
		 sum+=factorial(digits[i]);
	 }
	 return sum==n;
	}
	
}
