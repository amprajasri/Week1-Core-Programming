import java.util.Scanner;
public class mostFrequent
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int freq=0;
		char freqLetter=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(freq<count(str.charAt(i),str))
			{
				freq=count(str.charAt(i),str);
				freqLetter=str.charAt(i);
			}
			
		}
		System.out.println("Most Frequent Character: "+freqLetter);
		
	}
	public static int count(char x,String str)
	{
		int freq=0;
		for(int i=0;i<str.length();i++)
		{
			if(x==str.charAt(i)) freq++;
		}
		return freq;
	}
}