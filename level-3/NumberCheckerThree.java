import java.util.Scanner;
import java.lang.Math;
public class  NumberCheckerThree
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=digitCount(n);
		int digits[]=digitsFromNumber(n);
		int reverseDigits[]=digitsFromNumberReverse(n);
		boolean compareBoth=compare(digits,reverseDigits);
		boolean isPalindrome=palindrome(n);
		boolean isDuck=checkingDuckNumber(n);
		System.out.println("comparing digits in both array,they are same"+compareBoth);
		System.out.println("it is a palindrome: "+isPalindrome);
		System.out.println("it is a duck number:"+isDuck);
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
	public static int[] digitsFromNumberReverse(int n)
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
	public static boolean compare(int normal[],int reverse[])
	{
		boolean isSame=true;
		for(int i=0;i<normal.length;i++)
		{
			if (normal[i]!=reverse[reverse.length-1-i]) 
			{isSame=false;
			 break;}
		}
		return isSame;
	}
	public static boolean palindrome(int n)
	{
		int normal[]=digitsFromNumber(n);
		int reverse[]=digitsFromNumberReverse(n);
		boolean isPalindrome=true;
		for(int i=0;i<normal.length;i++)
		{
		  if(normal[i]!=reverse[i])
		  {
			isPalindrome=false;
			break;
		  }
		}
		return isPalindrome;
	}
	public static boolean checkingDuckNumber(int n)
	{
		if(n!=0) return true;
		else return false;
	}
	
}
