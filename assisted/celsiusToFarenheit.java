import java.util.Scanner;
public class celsiusToFarenheit
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		float celsius=input.nextFloat();
		System.out.println("farenheit:"+((celsius*(9/5.0))+32));
	}
}
