import java.util.Scanner;
import java.lang.Math;
public class  NumberChecker
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=digitCount(n);
		int digits[]=digitsFromNumber(n);
		boolean isDuck=checkingDuckNumber(n);
		boolean isArmstrong=checkingArmstrongNumber(n);
		int largest[]=findingLargest(n);
		int smallest[]=findingSmallest(n);
		//System.out.println("shortest: "+tallest);
		System.out.println("count of digits:"+count);
		System.out.println("digits:");
		for(int i=0;i<count;i++)
		{
		System.out.println(digits[i]);
		}
		System.out.println("is duck number: "+isDuck);
		System.out.println("is armstrong number: "+ isArmstrong);
		System.out.println("1st , 2nd largest:"+largest[0]+" , "+largest[1]);
		System.out.println("1st, 2nd smallest:"+smallest[0]+" , "+smallest[1]);

		
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
	public static boolean checkingDuckNumber(int n)
	{
		if(n>0) return true;
		else return false;
	}
	public static boolean checkingArmstrongNumber(int n)
	{
		int digits[]=digitsFromNumber(n);
		int sum=0;
		for(int i=0;i<digits.length;i++)
		{
			sum+=Math.pow(digits[i],3);
		}
		if(sum==n) return true;
		else return false;
	}
	public static int[] findingLargest(int n)
	{
		int digits[]=digitsFromNumber(n);
		int largest[]=new int[2];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<digits.length;i++)
		{
			if(max<digits[i]) max=digits[i];
		}
		largest[0]=max;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<digits.length;i++)
		{
			if(max2<digits[i] && digits[i]!=max) max2=digits[i];
			
		}
		largest[1]=max2;
		return largest;
	}
	public static int[] findingSmallest(int n)
	{
		int digits[]=digitsFromNumber(n);
		int smallest[]=new int[2];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<digits.length;i++)
		{
			if(min>digits[i]) min=digits[i];
		}
		smallest[0]=min;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<digits.length;i++)
		{
			if(min2>digits[i] && digits[i]!=min) min2=digits[i];
			
		}
		smallest[1]=min2;
		return smallest;
	}
}