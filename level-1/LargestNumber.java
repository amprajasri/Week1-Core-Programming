import java.util.Scanner;
public class LargestNumber{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n1=input.nextInt();
int n2=input.nextInt();
int n3=input.nextInt();
System.out.println("Is the first number the largest?"+(((n1>n2)&&(n1>n3))?"largest":"not largest"));
System.out.println("Is the second number the largest?"+(((n2>n1)&&(n2>n3))?"largest":"not largest"));
System.out.println("Is the third number the largest?"+(((n3>n1)&&(n3>n2))?"largest":"not largest") );
}
}