import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int start=0;
		int end=str.length()-1;
	    boolean isPalindrome=checking(str);
		boolean isPalindromeRecursion=checkUsingRecursion(str,start,end);
		boolean isPalindromeArray=checkUsingArray(str);
		if(isPalindrome && isPalindromeRecursion && isPalindromeArray)
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
		
	}
	public static boolean checking(String str)
	{
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{ 
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static boolean checkUsingRecursion(String str,int start,int end)
	{
		if(start>=end) return true;
		else if(str.charAt(start)!=str.charAt(end)) return false;
		return checkUsingRecursion(str,start+1,end-1);
	}
	
	public static boolean checkUsingArray(String str)
	{
		char arr[] = str.toCharArray();
		char reverse[]=new char[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse[index]=arr[i];
			index++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=reverse[i]) return false ;
		}
		return true;
	}
	
	
	
}