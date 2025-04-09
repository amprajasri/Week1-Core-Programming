import java.util.Scanner;
public class PowerUsingWhileloop{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int power=input.nextInt();
int result=1;
int temp=1;
while(temp<=power){
 result*=n;
 temp++;
}
System.out.println(result);
}
}