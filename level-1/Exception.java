import java.util.Scanner;
public class Exception
{
	public static void main(String[] args)
	{
		
		builtInException();
	}
	public static void builtInException()
	{
	 try
	 {
		String str=null;
		char a=str.charAt(0);
	 }
	 catch(NullPointerException e)
	 {
		System.out.println("can not access null string");
	 }
		
	}
}