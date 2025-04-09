import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
public class StringSplitLength
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String strArray[][]=getWordLength(str);
		System.out.println("words\tlength");
		System.out.println("-----------------------");
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i][0]+"\t"+(Integer.parseInt(strArray[i][1])));
		}

	}
	public static int count(String s)
	{ 
		int count=0;
		try{
		
		char ch;
		while(true)
		{
			
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
	
	public static String[][] getWordLength(String str)
	{
		String words[]=split(str);
		String wordAndLength[][]=new String[words.length][2];
		int length;
		for(int i=0;i<words.length;i++)
		{
			wordAndLength[i][0]=words[i];
			length=count(words[i]);
			wordAndLength[i][1]=String.valueOf(length);
		}
		return wordAndLength;
	}
}