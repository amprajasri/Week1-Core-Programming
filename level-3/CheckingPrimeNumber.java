import java.util.Scanner;
import java.lang.Math;
public class CheckingPrimeNumber{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
boolean flag=true;
if(n==1) System.out.println("prime number");
for(int i=2;i<=Math.sqrt(n);i++){
 if(n%i==0) 
 {flag=false;
  break;
 }
 
}
if(flag) System.out.println("prime number");
else System.out.println("not a prime number"); 
}
}