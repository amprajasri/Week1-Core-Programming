import java.util.Scanner;
import java.lang.Math;
public class PowerCalculation
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int base=input.nextInt();
		int power=input.nextInt();
		System.out.println("result:"+Math.pow(base,power));
	}
}