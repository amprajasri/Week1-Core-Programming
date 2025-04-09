import java.util.Scanner;
public class RectanglePerimeter
{
	public static void main(String[] args )
	{
		Scanner input=new Scanner(System.in);
		int l=input.nextInt();
		int b=input.nextInt();
		System.out.println("perimeter:"+(2*(l+b)));
	}
	
}