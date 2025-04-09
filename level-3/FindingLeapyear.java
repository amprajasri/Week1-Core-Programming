import java.util.Scanner;
public class FindingLeapyear{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int year=input.nextInt();
boolean flag=false;
if(year>=1582){
 if(((year%4==0) && (year%100!=0))){
   flag=true;
 }
 else if(((year%100==0) && (year%400==0))){
  flag=true;
 
 }
}
if(flag) System.out.println("it is a leapyear");
else System.out.println("it is not a leapyear");
}
}