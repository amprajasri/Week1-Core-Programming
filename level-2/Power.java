import java.util.Scanner;
public class Power{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int power=input.nextInt();
int result=1;
for(int i=1;i<=power;i++){
 result*=n;
}
System.out.println(result);
}
}