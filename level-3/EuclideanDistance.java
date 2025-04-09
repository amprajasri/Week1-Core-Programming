import java.util.Scanner;
import java.lang.Math;
public class  EuclideanDistance
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int x1=input.nextInt();
		int y1=input.nextInt();
		int x2=input.nextInt();
		int y2=input.nextInt();
		double dist=distance(x1,y1,x2,y2);
		double equation[]=lineEq(x1,y1,x2,y2);
		System.out.println("distance: "+dist);
		System.out.println("m and y-intercept b:"+equation[0]+" , "+equation[1]);
		
	}
	public static double distance(int x1,int y1,int x2,int y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
;
	}
	public static double[] lineEq(int x1,int y1,int x2,int y2)
	{
		double m=(double)(y1-y2)/(x1-x2);
		double b=y1-(m*x1);
		return new double[] {m,b};
	}
	
	
}
