import java.util.Scanner;
import java.lang.Math;
public class CircleArea
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		System.out.println("area:"+((float)(Math.PI*Math.pow(2,r))));
	}
}