import java.util.Scanner;
public class ExceptionIllegalAguments
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		builtInException(str);
		System.out.println(str.substring(5,1));//error
	}
	public static void builtInException(String str)
	{
	 try
	 {
			System.out.println(str.substring(1,0));
	 }
	 catch(StringIndexOutOfBoundsException e)
	 {
		System.out.println("start index should be less than end");
	 }
		
	}
}