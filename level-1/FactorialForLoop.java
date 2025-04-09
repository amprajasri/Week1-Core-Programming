import java.util.Scanner;
public class FactorialForLoop{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextLong();
long fact=1;
for(long i=n;i>=1;i--){
 fact=fact*i;
  
}
System.out.println("factorial:"+fact);
}
}