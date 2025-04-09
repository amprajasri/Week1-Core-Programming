import java.util.Scanner;
import java.lang.Math;
public class NumberGuessing
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String status;
		int num;
		int l=1;
		int h=100;
		boolean win=false;
		for(int i=0;i<10;i++)
		{
			num=getRandom(l,h);
			System.out.println((i+1)+"th attempt: "+num);
			status=input.nextLine();
			if(status.equals("low"))
			{
				l=num+1;
				
			}
			else if(status.equals("high"))
			{
				
				h=num;
			}
			else if(status.equals("correct"))
			{
				System.out.println("yes!!! :)");
				win=true;
				break;
			}
			else
			{
				System.out.println("incorrect response");
			}
		}
		if(!win) System.out.println("out of limit :(");
	}
	
	public static int getRandom(int l, int h)
	{
		int  temp=l+(int)(Math.random()*(h-l));
		return temp;
	}
}