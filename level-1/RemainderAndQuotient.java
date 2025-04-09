import java.util.Scanner;
public class RemainderAndQuotient
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
		int num=input.nextInt();
		int divisor=input.nextInt();
		int result[]=new int[2];
		result=findRemainderAndQuotient(num,divisor);
		System.out.println("quotient is: "+result[0]);
		System.out.println("remainder is: "+result[1]);
	}
}