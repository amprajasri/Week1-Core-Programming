import java.util.Scanner;
public class MultiplesOfNumber{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if(n>0 && n<100){
for(int i=100;i>0;i--){
 if(i%n==0){
 System.out.println(i);
 }
}
}
}
}