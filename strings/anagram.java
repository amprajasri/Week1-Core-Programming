import java.util.Scanner;
import java.util.Arrays;
public class anagram
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    String str1=input.nextLine();
		String str2=input.nextLine();
		boolean isAnagram=checking(str1,str2)
		if(isAnagram) System.out.println("they are anagrams")
		else System.out.println("they ar enot anagrams");
	}
	
	public static boolean checking(String str1,String str2)
	{
		res1=str1.replaceAll("\\s","").toLowerCase();
		res2=str2.replaceAll("\\s","").toLowerCase();
		if(res1.length()!=res2.length()) return flase;
		arr1[]=res1.toCharArray();
		arr1[]=res1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i]) return flase;
		}
		return true;
	}
}
