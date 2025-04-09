import java.util.Scanner;
import java.lang.Math;
public class  NumberCheckerFour
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=digitCount(n);
		int digits[]=digitsFromNumber(n);
		boolean isPrime=prime(n);
		boolean isNeon=neon(n);
		boolean isSpy=spy(n);
		boolean isAutomorphic=automorphic(n);
		boolean isBuzz=buzz(n);
		System.out.println("it is a prime number:"+isPrime);
		System.out.println("it is a neon number:"+isNeon);
		System.out.println("it is a spy number:"+isSpy);
		System.out.println("it is a automorphic number:"+isAutomorphic);
		System.out.println("it is a buzz number:"+isBuzz);
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
	public static boolean neon(int n)
	{
		int square=n*n;
		int squareNumbers[]=digitsFromNumber(square);
		int sum=0;
		for(int i=0;i<squareNumbers.length;i++)
		{
			sum+=squareNumbers[i];
		}
		if(sum==n) return true;
		else return false;
	}
	public static boolean spy(int n)
	{
		int digits[]=digitsFromNumber(n);
		int sum=0;
		int prod=1;
		for(int i=0;i<digits.length;i++)
		{
			sum+=digits[i];
		}
		for(int i=0;i<digits.length;i++)
		{
			prod*=digits[i];
		}
		if(sum==prod) return true;
		else return false;
	}
	public static boolean automorphic(int n)
	{
		int square=n*n;
		return String.valueOf(square).endsWith(String.valueOf(n));
		
	}
	public static boolean buzz(int n)
	{
		if(n%7==0 || n%10==7) return true;
	
		return false;
	}
	
}
