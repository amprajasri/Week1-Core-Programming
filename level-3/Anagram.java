import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		boolean isAnagram=checking(str1,str2);
		System.out.println("it is anagram:"+isAnagram);
	}
	public static boolean checking(String str1,String str2)
	{
		if(str1.length()!=str2.length()) return false;
		String arr1[][]=getUnique(str1);
		String arr2[][]=getUnique(str2);
		if(arr1.length!=arr2.length) return false;
		else
		   for(int i=0;i<arr1.length;i++)
		   {
				if(!(arr1[i][0].equals(arr2[i][0]))|| !(arr1[i][1].equals(arr2[i][1]))) return false;
		   }
		   return true;
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