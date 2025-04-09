import java.util.Scanner;
public class StringReplace
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    String str1=input.nextLine();
		String str2=input.nextLine();
		String str3=input.nextLine();
		String result=str1.replaceAll(str2,str3);
		
		System.out.println(result);
	}
	
	
	
	
}
