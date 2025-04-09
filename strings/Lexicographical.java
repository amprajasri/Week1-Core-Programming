import java.util.Scanner;
public class Lexicographical
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		int result=str1.compareTo(str2);
		if(result<0) System.out.println(str1+" come before "+str2+" in lexicographical order");
		else 
		System.out.println(str2+" come before "+str1+" in lexicographical order");
	}
	
}