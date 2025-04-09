import java.util.Scanner;
import java.lang.Math;
public class  NumberCheckerTwo
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=digitCount(n);
		int digits[]=digitsFromNumber(n);
		int squaresSum=sumOfPowers(n);
	    boolean isHarshadNumber=harshadNumber(n);
		int freq[][]=digitFrequency(n);
		System.out.println("sum of squares: " + squaresSum);
        System.out.println("is harshad Number: "+isHarshadNumber);
		for(int i=0;i<10;i++)
		{
		System.out.println(freq[i][0]+":"+freq[i][1]);
		}
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
		int lastNumber=0,index=0;
		while(n>0)
		{
			lastNumber=n%10;
			digits[index]=lastNumber;
			index++;
			n=n/10;
		}
		return digits;
	}
	public static int sumOfPowers(int n)
	{
		int digit[]=digitsFromNumber(n);
		int squaresSum=0;
		for(int i=0;i<digit.length;i++)
		{
			squaresSum+=Math.pow(digit[i],2);
		}
		return squaresSum;
	}
	public static boolean harshadNumber(int n)
	{
			int digit[]=digitsFromNumber(n);
			int sum=0;
			for(int i=0;i<digit.length;i++)
			{
				sum+=digit[i];
			}
			if(n%sum==0) return true;
			else return false;
	}
	public static int[][] digitFrequency(int n)
	{
		
		int frequency[][]=new int[10][2];
		int digits[]=digitsFromNumber(n);
		for(int i=0;i<10;i++)
		{
		  frequency[i][0]=i;
		  frequency[i][1]=0;
		}
		for(int i:digits)
		{
			frequency[i][1]++;
		}
		return frequency;
	}
	
}