import java.util.Scanner;
public class MultiplesOfNumberUsingWhileloop{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if(n>0 && n<100){
int temp=100;
while(temp>0){
 if(temp%n==0){
 System.out.println(temp);
 }
 temp--;
}
}
}
}