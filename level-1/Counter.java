import java.util.Scanner;
public class Counter{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int num=input.nextInt();
while(num>=1){
System.out.println(num);
num--;
}
}
}