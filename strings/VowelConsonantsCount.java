import java.util.Scanner;
import java.lang.Integer;
public class VowelConsonantsCount
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int vowelConsonat[]=getCount(str);
		System.out.println("vowels:"+vowelConsonat[0]);
		System.out.println("consonant:"+vowelConsonat[1]);
		System.out.println("not letter:"+vowelConsonat[2]);
	}
	public static int[] getCount(String s)
	{ 
		int vowel=0,consonant=0,notLetter=0;
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='A' && ch<='Z') ch=(char)(32+s.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowel++;
			else if(ch>'a' && ch<='z') consonant++;
			else notLetter++;
			
		}
		return new int[] {vowel,consonant,notLetter};
	}
	
	
}