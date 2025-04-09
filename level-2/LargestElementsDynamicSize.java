import java.util.Scanner;
public class LargestElementsDynamicSize

{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		int maxDigit=10;
		int numbers[]=new int[maxDigit];
		int index=0;
		int lastDigit;
		int largest=0;
		int secondLargest=0;
		while(n>0)
		{
			lastDigit=(int)n%10;
			if(index==maxDigit) 
			{
				maxDigit*=2;
				int temp[]=new int[maxDigit];
				System.arraycopy(numbers,0,temp,0,index);
				numbers=temp;
			 }
			numbers[index]=lastDigit;
			index++;
			n=n/10;
		}
		for(int i=0;i<index;i++)
		{if(largest<numbers[i]) largest=numbers[i];
		}
		for(int i=0;i<index;i++)
		{if(secondLargest<numbers[i] && numbers[i]!=largest) secondLargest=numbers[i];
		}
		System.out.println("largest element is: "+largest);
		System.out.println("second largest element is: "+secondLargest);

	}
}