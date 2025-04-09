import java.util.Scanner;
import java.lang.Integer;
public class LargestSmallestWord
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
        int largestSmallest[]=findLargestSmallest(strArray);
		System.out.println("largest word:"+strArray[largestSmallest[0]][0]);
		System.out.println("smallest word:"+strArray[largestSmallest[1]][0]);
		
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
	
	public static int[] findLargestSmallest(String str[][])
	{
		int largest=Integer.parseInt(str[0][1]);
		int largestIndex=0,smallestIndex=0;
		int smallest=Integer.parseInt(str[0][1]);
		for(int i=0;i<str.length;i++)
		{
			if(largest<Integer.parseInt(str[i][1])) 
			{largest=Integer.parseInt(str[i][1]);
			 largestIndex=i;
			}
			if(smallest>Integer.parseInt(str[i][1])) 
			{
			 smallest=Integer.parseInt(str[i][1]);
			 smallestIndex=i;
			}
		}
		return new int[]{largestIndex,smallestIndex};
	}
}