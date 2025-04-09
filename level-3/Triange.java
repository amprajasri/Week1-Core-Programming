import java.util.Scanner;
public class Triange
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int x1=input.nextInt();
		int y1=input.nextInt();
		int x2=input.nextInt();
		int y2=input.nextInt();
		int x3=input.nextInt();
		int y3=input.nextInt();
		boolean isCollinearSlope=checkCollinearSlope(x1,y1,x2,y2,x3,y3);
		boolean isCollinearArea=checkCollinearArea(x1,y1,x2,y2,x3,y3);
		if(isCollinearSlope && isCollinearArea) System.out.println("collinear points");
		else System.out.println("they are not collinear");
		
	}
	public static boolean checkCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		float s1= (float)(y2 - y1)/(x2 - x1);
		float s2= (float)(y3 - y2)/(x3 - x2);
		float s3=(float)(y3 - y1)/(x3 - x1);
		return ((s1==s2) && (s2==s3));
	}
	public static boolean checkCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	   int determinant=x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
	   return determinant == 0;
	}
	
}