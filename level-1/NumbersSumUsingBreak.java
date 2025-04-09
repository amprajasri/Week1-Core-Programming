import java.util.Scanner;
public class NumbersSumUsingBreak{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double sum=0;
double n=1;
while(true){
 n=input.nextInt();
 if(n==0) break;
 sum+=n;
}
System.out.println("sum:"+sum);
}
}