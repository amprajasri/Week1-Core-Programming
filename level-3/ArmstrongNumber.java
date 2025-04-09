import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 int temp=n;
 int sum=0;
 int last_number;
 while(temp>0){
  last_number=temp%10;
  sum+=Math.pow(last_number,3);
  temp=temp/10;
 }
 if(sum==n) System.out.println("Armstrong Number");
 else System.out.println("not an Armstrong Number");
}
}