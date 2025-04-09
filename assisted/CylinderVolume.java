import java.util.Scanner;
import java.lang.Math;
public class CylinderVolume
{
	public static void main(String[] args)
	{
	Scanner input= new Scanner(System.in);
	int r=input.nextInt();
	int h=input.nextInt();
	System.out.println("volume:"+((float)(Math.PI*Math.pow(r,2)*h)));
	}
}
