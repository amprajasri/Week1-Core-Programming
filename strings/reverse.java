import java.util.Scanner;
public class reverse
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result+=str.charAt(i);
		}
		System.out.println(result);
		
	}
}