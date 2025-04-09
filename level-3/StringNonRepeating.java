import java.util.Scanner;
public class StringNonRepeating
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char unique[]=getUnique(str);
		for(char i:unique)
			System.out.println(i);
	}
	

	public static char[] getUnique(String str)
	{
		int freq[]=new int[256];
		int count=0;
		for(int i=0;i<str.length();i++)
		 {
			freq[str.charAt(i)]++;
			
		}
		for(int i=0;i<256;i++)
		{
			if(freq[i]>0) count++;
		}
		char result[]=new char[count];
		int index=0;
		for(int i=0;i<256;i++)
		{
			if(freq[i]>0)
			{
			   result[index]=(char)i;
			   index++;
		    }
		}
		return result; 
		
	}
}