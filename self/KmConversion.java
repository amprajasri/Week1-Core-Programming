import java.util.Scanner;
public class KmConversion
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		float Km=input.nextFloat();
		System.out.println("miles:"+(Km * 0.621371));
	}
}