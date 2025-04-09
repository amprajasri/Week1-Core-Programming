import java.util.Scanner;
import java.lang.Math;
public class WindChill
{
	public static double calculateWindChill(double temp,double speed)
	{
		double result=35.74 + 0.6215 *temp + ((0.4275*temp) - 35.75) * Math.pow(speed,0.16);
		return result;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double temp=input.nextDouble(); 
		double speed=input.nextDouble();
		double windChillTemp=calculateWindChill(temp,speed);
		System.out.println("wind chill temperature is:"+windChillTemp);
	}
}
