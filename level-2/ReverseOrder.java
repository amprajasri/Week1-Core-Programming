import java.util.Scanner;
public class ReverseOrder

{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int temp=n;
		int count=0;
		int lastDigit;
		int index=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int numbers[]=new int[count];
		while(temp>0)
		{
			lastDigit=temp%10;
			numbers[index]=lastDigit;
			index++;
			temp=temp/10;
		}
			
		for(int i=0;i<count;i++)
		{
			System.out.println(numbers[i]);
		}

	}
}