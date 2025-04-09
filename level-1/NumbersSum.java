import java.util.Scanner;
public class NumbersSum{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double sum=0;
double n=1;
while(n!=0){
 n=input.nextInt();
 sum+=n;
}
System.out.println("sum:"+sum);
}
}