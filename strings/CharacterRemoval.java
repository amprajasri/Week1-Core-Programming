import java.util.Scanner;
public class CharacterRemoval
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char ch=input.nextLine().charAt(0);
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			result+=str.charAt(i);
		}
		System.out.println(result);
	}
}