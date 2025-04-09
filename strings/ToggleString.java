import java.util.Scanner;
public class ToggleString
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String toggledStr=toggle(str);
		System.out.println(toggledStr);
	}
	public static String toggle(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			 result+=Character.toUpperCase(str.charAt(i));
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			 result+=Character.toLowerCase(str.charAt(i));
		}
		return result;
	}
}