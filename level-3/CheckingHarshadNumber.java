import java.util.Scanner;
public class CheckingHarshadNumber{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 int sum=0;
 int last_number;
 while(n>0){
 last_number=n%10;
 sum+=last_number;
 n=n/10;
 }
 
if(n%sum==0)System.out.println("is Harshad Number");
else System.out.println("is not Harshad Number");

}
}