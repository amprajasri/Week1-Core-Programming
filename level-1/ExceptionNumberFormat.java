import java.util.Scanner;
import java.lang.Integer;
public class ExceptionNumberFormat
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		builtInException(str);
		int a=Integer.parseInt(str);//error
	}
	public static void builtInException(String str)
	{
	 try
	 {
			int a=Integer.parseInt(str);
			System.out.println(a);
	 }
	 catch(NumberFormatException e)
	 {
		System.out.println("string does not have numbers");
	 }
		
	}
}