import java.util.Scanner;
import java.util.Arrays;
public class StringArray
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char str1[]=getCharArray(str);
		System.out.println("from user defined");
		for(char i:str1) System.out.println(i);
		char str2[]=str.toCharArray();
		System.out.println("from built-in:");
		for(char i:str2) System.out.println(i);
		System.out.println("both are same:"+Arrays.equals(str1,str2));
		
	}
	public static char[] getCharArray(String s1)
	{
		char str[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			str[i]=s1.charAt(i);
		}
		return str;	
	}
}