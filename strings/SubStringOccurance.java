import java.util.Scanner;
public class SubStringOccurance
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String substr=input.nextLine();
		int count=0;
		String val;
		for(int i=0;i<str.length()-substr.length();i++)
		{
			val=str.substring(i,i+substr.length());
			if(val.equals(substr)) count++;
		}
		
		System.out.println(count);
	}
	
}