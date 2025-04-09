import java.util.Scanner;
import java.lang.Math;
public class Trignometry
{
	public static double[] calculateTrigonometricFunctions(double angle )
	{
		double radian=Math.toRadians(angle);
		double sin=Math.sin(radian);
		double cos=Math.cos(radian);
		double tan=Math.tan(radian);
		return new double[]{sin,cos,tan};
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double angle=input.nextDouble();
		double result[]=calculateTrigonometricFunctions(angle);
		System.out.println("sin value:"+result[0]);
		System.out.println("cos value:"+result[1]);
		System.out.println("tan value:"+result[2]);
	}
}
