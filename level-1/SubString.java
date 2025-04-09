import java.util.Scanner;
public class SubString
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		int start=input.nextInt();
		int end=input.nextInt();
		String subStr1=getSubStr(s1,start,end);
		System.out.println(subStr1);
		String subStr2=s1.substring(start,end);
		System.out.println(subStr2);
		System.out.println("are same: "+subStr1.equals(subStr2));
	}
	public static String getSubStr(String s1,int start,int end)
	{
			String temp="";
			for(int i=0;i<s1.length();i++)
			{
				if(i>=start && i<end) temp+=s1.charAt(i);
			}
			return temp;
	}
}