import java.util.Scanner;
public class DayOfWeek{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
  int month=input.nextInt();
  int date=input.nextInt();
  int year=input.nextInt();
  
  int y=year-(14-month)/12;
  int x=y+y/4-y/100+y/400;
  int m=month+12*((14-month)/12)-2;
  int d=(date+x+(31*month)/12)%7;
  String[] days = {"Sunday", "Monday","Tuesday", "Wednes", "Thursday", "Friday", "Saturday" } ; 
  System.out.println("Day of the week: " + days[d]);
  
  
  
 



}
}