import java.util.Scanner;
import java.lang.Math;
public class GCDAndLCM
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    int n1=input.nextInt();
		int n2=input.nextInt();
		int LCM=getLCM(n1,n2);
		int GCD=getGCD(n1,n2);
		System.out.println("LCM:"+LCM);
		System.out.println("GCD:"+GCD);
	}
	

	public static int  getLCM(int n1, int n2)
	{
		int val=getGCD(n1,n2);
		return (n1*n2)/val;
	}
	
	public static int  getGCD(int n1, int n2)
	{
		int temp;
		while(n2!=0)
		{
			temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}
	
	
}