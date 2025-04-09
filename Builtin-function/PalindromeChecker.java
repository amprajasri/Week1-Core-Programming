import java.util.Scanner;
import java.lang.Math;
public class PalindromeChecker
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    String str=input.nextLine();
		boolean isPalindrome=palindrome(str);
		if(isPalindrome)
	    System.out.println("it is palindrome");
		else
		 System.out.println("it is not a palindrome");
	}
	

	public static boolean palindrome(String str)
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
	
}