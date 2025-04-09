import java.util.Scanner;
public class FindingLeapyearLogivcalOperands{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int year=input.nextInt();
boolean flag=false;
if(((year>=1582) && ((year%4==0) && (year%100!=0))) || ((year>=1582) && ((year%100==0) && (year%400==0))) ) flag=true;
if(flag) System.out.println("it is a leapyear");
else System.out.println("it is not a leapyear");
}
}