import java.util.Scanner;
import java.lang.Math;
public class NumberChecking
{
	public static int checking(int number)
	{	
		if(number<0) return -1;
		else if(number>0) return 1;
		else return 0;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(checking(n));
	}
}