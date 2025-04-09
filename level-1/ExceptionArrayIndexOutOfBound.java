import java.util.Scanner;
import java.lang.Integer;
public class ExceptionArrayIndexOutOfBound
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String names[]=new String[3];
		for(int i=0;i<3;i++)
		{
			names[i]=input.nextLine();
		}
		builtInException(names);
		System.out.println(names[3]);//error
	}
	public static void builtInException(String str[])
	{
	 try
	 {
			
			System.out.println(str[3]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		System.out.println("out of limit");
	 }
		
	}
}