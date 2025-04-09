import java.util.Scanner;
import java.lang.Integer;
public class WordType
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String vowelConsonat[][]=getWordDetail(str);
		display(vowelConsonat);
		
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
	public static String[][] getWordDetail(String s)
	{ 
		String output[]={"vowel","consonant","not a letter"};
		int wordCount=count(s);
		String wordType[][]=new String[wordCount][2];
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			wordType[i][0]=""+ch;
			if(ch>='A' && ch<='Z') ch=(char)(32+s.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') wordType[i][1]=output[0];
			else if(ch>'a' && ch<='z') wordType[i][1]=output[1];
			else wordType[i][1]=output[2];
			
		}
		return wordType;
	}
	
	public static void display(String info[][])
	{
		System.out.println("character\tType");
		System.out.println("------------------");
		for(int i=0;i<info.length;i++)
		{
			System.out.println(info[i][0]+"\t"+info[i][1]);
		}
	}
	
}