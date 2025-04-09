import java.util.Scanner;
import java.lang.Math;
public class quadratic
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		double rootValues[]=roots(a,b,c);
		if(rootValues.length==0) System.out.println("no roots");
		else System.out.println("roots: "+rootValues[0]+" , "+rootValues[1]);
	}
	public static double[] roots(int a,int b,int c)
	{
		double delta=Math.pow(b,2)-4*a*c;
		double result[]=new double[2];
		if(delta==0) return new double[0];
		if(delta>0)
		{
			result[0]=(-b+Math.sqrt(delta))/(2*a);
			result[1]=(-b-Math.sqrt(delta))/(2*a);
		}
		else  result[0]=result[1]=-b/(2*a);
		return result;
	}
}