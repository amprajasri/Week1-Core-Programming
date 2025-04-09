import java.util.Scanner;
public class StringFreqArray
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String freq[]=getFreq(str);
		for(int i=0;i<freq.length;i++)
		 System.out.println(freq[i]);
		
		
	}
	public static String[] getFreq(String str)
	{
		char arr[]=str.toCharArray();
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='0') continue;
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='0';
					freq[i]++;
					freq[j]=0;
				}
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
		  if(arr[i]!='0')
			{
				
				
				count++;
			}
		}
		String result[]=new String[count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
		  if(arr[i]!='0')
			{
				
				result[index]=arr[i]+"-"+String.valueOf(freq[i]);
				index++;
			}
		}
		return result;
	}
}