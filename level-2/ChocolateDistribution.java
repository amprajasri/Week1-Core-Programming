import java.util.Scanner;
public class ChocolateDistribution{
public static void main(String6[] args){
Scanner input=new Scanner(System.in);
int children=input.nextInt();
int chocolate=input.nextInt();
int each=chocolate/children;
int remain=chocolate%children;
System.out.println("The number of chocolates each child gets is "+each+" and the number of remaining chocolates are "+remain);
}
}