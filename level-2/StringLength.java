import java.util.Scanner;
import java.util.Arrays;
public class StringLength
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int length=count(str);
		
		if(length==str.length()) System.out.println(length);
	}
	public static int count(String s)
	{ 
		int count=0;
		try{
		
		char ch;
		while(true)
		{
			ch=s.charAt(count);
			ch=s.charAt(count);
			count++;
			
		}
		}
		catch(StringIndexOutOfBoundsException e)
		{ 
		  
		  return count;
		}
		
	}
}