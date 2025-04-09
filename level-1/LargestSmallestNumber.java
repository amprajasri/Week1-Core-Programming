import java.util.Scanner;
public class LargestSmallestNumber
{
	public static int[] findSmallestAndLargest(int number1,int number2,int number3)
	{  
		int result[]=new int[2];
		if(number1<number2 && number1<number3) result[0]=number1;
		else if(number2<number1 && number2<number3) result[0]=number2;
		else result[0]=number3;
		if(number1>number2 && number1>number3) result[1]=number1;
		else if(number2>number1 && number2>number3) result[1]=number2;
		else result[1]=number3;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int result[]=new int[2];
		result=findSmallestAndLargest(n1,n2,n3);
		System.out.println("largest number is: "+result[1]);
		System.out.println("smallest number is: "+result[0]);
	}
}