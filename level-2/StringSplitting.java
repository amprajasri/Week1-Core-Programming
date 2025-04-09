import java.util.Scanner;
import java.util.Arrays;
public class StringSplitting
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String strArray1[]=split(str);
		for(String i:strArray1) System.out.println(i);
		String strArray2[]=str.split(" ");
		for(String i:strArray2) System.out.println(i);
		System.out.println("are same: "+Arrays.equals(strArray1,strArray2));
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
	public static String[] split(String str)
	{
		int wordCount=0;
		int length=count(str);
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)==' ') wordCount++;
		}
		
		String words[]=new String[wordCount+1];
		int index=0;
		int start=0;
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)==' ')
			{
				words[index]=str.substring(start,i);
				index++;
				start=i+1;
			}
		}
		words[index]=str.substring(start);
		return words;
	}
}