import java.util.Scanner;
public class MaxHandshakes
{
	public static void combinations()
	{	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		float tot=(n*(n-1))/2;
		System.out.println("maximum number of handshakes among "+n+" number of students: "+tot);
	}
	public static void main(String[] args)
	{
	  combinations();	
	}
	
}