import java.util.Scanner;
import java.lang.Math;
public class MaximumNumber
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int largest=Math.max(n1,n2);
		largest=Math.max(largest,n3);
		System.out.println("largest: "+largest);
	}
	
	
}