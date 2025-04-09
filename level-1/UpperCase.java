import java.util.Scanner;
public class UpperCase
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String s1=upperCase(str);
		System.out.println(s1);
		System.out.println(str.toUpperCase());
		System.out.println("both are same:"+s1.equals(str.toUpperCase()));
	}
	public static String upperCase(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				temp+=(char)(str.charAt(i)-32);
			}
			else temp+=(char)(str.charAt(i));
		}
		return temp;
		
	}
}