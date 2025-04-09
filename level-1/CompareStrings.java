import java.util.Scanner;
public class CompareStrings
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		boolean areSame=strComapre(s1,s2);
		if(areSame && s1.equals(s2)) System.out.println("both are same");
		else System.out.println("they are not same");
		
	}
	public static boolean strComapre(String s1,String s2)
	{
		if(s1.length()!=s2.length()) return false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
		return true;
	}
}