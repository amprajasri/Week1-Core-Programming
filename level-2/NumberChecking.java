import java.util.Scanner;
public class NumberChecking
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int numbers[]=new int[5];
		boolean positive,even;
		for(int i=0;i<5;i++)
		{
			numbers[i]=input.nextInt();
			positive=isPositive(numbers[i]);
			even=isEven(numbers[i]);
			if(positive) System.out.println("it is positive number");
			else System.out.println("it is negative number");
			if(even) System.out.println("it is even number");
			else System.out.println("it is odd number");
		}
		compare(numbers[0],numbers[4]);
		
	}
	public static boolean isPositive(int n)
	{
		if(n>0) return true;
		else return false;
	}
	public static boolean isEven(int n)
	{
		if(n%2==0) return true;
		else return false;
	}
	public static void compare(int n1,int n2)
	{
	 if(n1>n2) System.out.println("first element is greater than the last element");
	 else if(n1<n2) System.out.println("first element is less than the last element");
	 else System.out.println("first element is equal to the last element");
	}
}