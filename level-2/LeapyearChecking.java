import java.util.Scanner;
public class LeapyearChecking
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		boolean isLeapyear=checking(year);
		if(isLeapyear) System.out.println("it is a leapyear");
		else System.out.println("it is not a leapyear");
		
		
		
	}
	public static boolean checking(int year)
	{
		boolean flag=false;
			if(year>=1582)
			{
				if(((year%4==0) && (year%100!=0))){
				flag=true;
			}
			else if(((year%100==0) && (year%400==0)))
			{
				flag=true;
 
			}
			}
			return flag;
	}
	

	
}