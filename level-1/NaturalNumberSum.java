import java.util.Scanner;
public class NaturalNumberSum
{
	public static int summation(int n)
	{   int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("sum: "+summation(n));
	}
}