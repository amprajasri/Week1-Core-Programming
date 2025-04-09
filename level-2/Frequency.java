import java.util.Scanner;
public class Frequency
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		int frequency[]=new int[10];
		int numbers[]=new int[19];
		int lastNumber;
		int i=0;
		while(n>0)
		{
			lastNumber=(int)n%10;
			numbers[i]=lastNumber;
			i++;
			n=n/10;
		}
		
		for(int j=0;j<i;j++)
		{
			frequency[numbers[j]]++;
			
		}
		for(int j=0;j<10;j++)
		{
			
			System.out.println("frequency of "+j+" ="+frequency[j]);
		}
		
	}
	
}