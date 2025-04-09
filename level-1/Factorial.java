import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextLong();
long fact=1;
while(n>0){
 fact=fact*n;
  n--;  
}
System.out.println("factorial:"+fact);
}
}