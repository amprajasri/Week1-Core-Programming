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
		if(isPalindrome)
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
}