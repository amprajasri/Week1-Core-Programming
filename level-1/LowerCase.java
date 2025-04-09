import java.util.Scanner;
public class LowerCase
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String lowerStr=lowerCase(s);
		System.out.println(lowerStr);
		System.out.println(s.toLowerCase());
		System.out.println("both are same:"+lowerStr.equals(s.toLowerCase()));
	}
	public static String lowerCase(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') temp+=(char)(str.charAt(i)+32);
			else temp+=str.charAt(i);
		}
		return temp;
	}
}