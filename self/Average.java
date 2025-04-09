import java.util.Scanner;
public class Average
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		System.out.println("average:"+((n1+n2+n3)/3));
	}
}