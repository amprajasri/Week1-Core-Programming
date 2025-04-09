import java.util.Scanner;
public class ChocolateDistribution
{
	public static int[] findRemainderAndQuotient(int number, int divisor)
	{  
		int result[]=new int[2];
		result[0]=number/divisor;
		result[1]=number%divisor;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int numberOfChocolates=input.nextInt();
		int students=input.nextInt();
		int result[]=new int[2];
		result=findRemainderAndQuotient(numberOfChocolates,students);
		System.out.println("number of chocolates each student get is: "+result[0]);
		System.out.println("remaining chocolates: "+result[1]);
	}
}