import java.util.Scanner;
public class FiveDivisible{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
System.out.println(" Is the number "+n+" divisible by 5? "+((n%5)==0?"divisible":"not divisible" ));
}
}