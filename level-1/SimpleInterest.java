import java.util.Scanner;
public class SimpleInterest
{
	public static void calculation()
	{	Scanner input=new Scanner(System.in);
		double principle=input.nextDouble();
		double rate=input.nextDouble();
		double time=input.nextDouble();
		double interest=(principle*rate*time)/100;
		System.out.println("simple interest: "+interest);
	}
	public static void main(String[] args)
	{
	  calculation();	
	}
	
}