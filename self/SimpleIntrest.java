import java.util.Scanner;
public class SimpleIntrest
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		float principal=input.nextFloat();
		int rate=input.nextInt();
		int time=input.nextInt();
		
		System.out.println("Simple Intrest:"+((principal*rate*time)/100.0));
	}
}