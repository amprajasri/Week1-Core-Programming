import java.util.Scanner;
import java.lang.Math;
public class Calendar
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		int year=input.nextInt();
		displayCalender(month,year);
	}
	public static String getMonthName(int month)
	{ String months[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
	  return months[month-1];
	}
	public static int getMonthDays(int month,int year)
	{
	 int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
	 int daysInMonth=days[month-1];
	 boolean isLeapyear;
	 if(month-1==1) 
	 {
		isLeapyear=checkingLeapyear(year);
		if(isLeapyear) daysInMonth=29;
		
	 }
	
	 return daysInMonth;
	}
	public static boolean checkingLeapyear(int year)
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
	public static int dayOfWeek(int d, int m, int y)
	{     
		    int y0 = y - (14 - m) / 12;
			int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;  
            
		    return d0;
  
	}
	public static void displayCalender(int month,int year)
	{
		String monthName = getMonthName(month);
        int days = getMonthDays(month, year);
        int firstDayOfMonth = dayOfWeek(1, month, year);

        System.out.println( monthName + " " + year);
        System.out.println(" Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("\t");
        }

        
        for (int day = 1; day <= days; day++) {
            System.out.printf("%d\t", day);
            if ((firstDayOfMonth + day) % 7 == 0) { 
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println();
		
	}
	
	
}