import java.util.Scanner;
public class SimpleIntrest{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
double principle=input.nextDouble();
double rate=input.nextDouble();
double time=input.nextDouble();
double amount=(principle*rate*time)/100;
System.out.println("The Simple Interest is "+amount+" for Principal "+principle+" , Rate of Interest "+rate+" and Time "+time);
}
}