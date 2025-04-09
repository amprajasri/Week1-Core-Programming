import java.util.Scanner;
public class StringUniqueFrequency
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char unique[]=getUnique(str);
		for(char i:unique)
			System.out.println(i);
		String freq[][]=getFreq(str);
		for(int i=0;i<freq.length;i++)
		{
			System.out.println(freq[i][0]+"-"+freq[i][1]);
		}
		
	}
	public static char[] getUnique(String str)
	{
		int l=count(str);
		boolean exists=false;
		char letters[]=new char[l];
		int index=0;
		for(int i=0;i<l;i++)
		{	if(i!=0)
	
        	{
			  for(int j=i-1;j>=0;j--)
			  {
				if(str.charAt(i)==str.charAt(j)) exists=true; 
			  }
			}
         	if(!exists)
			{
				letters[index]=str.charAt(i);
				index++;
				
			}
			exists=false;
		}
		char result[]=new char[index];
		for(int i=0;i<index;i++)
		{
			result[i]=letters[i];
		}
		
		return result; 
		
	}
	

	public static String[][] getFreq(String str)
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
		String result[][]=new String[count][2];
		int index=0;
		char ch;
		for(int i=0;i<256;i++)
		{
			if(freq[i]>0)
			{
			   ch=(char)i;
			   result[index][0]=ch+"";
			   result[index][1]=String.valueOf(freq[i]);
			   index++;
		    }
		}
		return result; 
		
	}
}