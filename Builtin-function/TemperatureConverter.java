import java.util.Scanner;
import java.lang.Math;
public class TemperatureConverter
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
	    double temp=input.nextInt();
		input.nextLine();
		String units=input.nextLine();
		if(units.equalsIgnoreCase("F")) 
		{
			System.out.println("celsius for given temp is:"+farenheitToCelsius(temp));
			
		}
		else if(units.equalsIgnoreCase("C"))
		{
			System.out.println("farenheit for given temp is:"+celsiusToFarenheit(temp));
			
		}
	}
	

	public static double  farenheitToCelsius(double farenheit)
	{
		double celsiusResult= (farenheit-32) * (5.0/9);
		return celsiusResult;
	}
	
	public static double celsiusToFarenheit(double celsius)
	{
		double farenheitResult =celsius * (9.0 / 5) + 32;
		return farenheitResult;
	}
	
	
}