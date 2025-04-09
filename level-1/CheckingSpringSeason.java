import java.util.Scanner;
import java.lang.Math;
public class CheckingSpringSeason
{
	public static boolean checking(int day,int month)
	{	
		if((month>3 && month<6) ){
				return true;
		}
		else if((month==3)&& (day>20)){
				return true;
		}
		else if((month==6) && (day<20)){
			return true;
		}
		else{
			return false;
			}

	}
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int day=input.nextInt();
		int month=input.nextInt();
		boolean isSpring=checking(day,month);
		if(isSpring)
		{
			System.out.println("it is spring season");
		}
		else
		{
			System.out.println("it is not spring season");
		}
	}
}