import java.util.Scanner;
public class StringFrequency2D
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String freq[][]=getUnique(str);
		for(int i=0;i<freq.length;i++)
		{
			System.out.println(freq[i][0]+"-"+freq[i][1]);
		}
		
	}
	

	public static String[][] getUnique(String str)
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