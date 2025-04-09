import java.util.Scanner;
public class CalculatingBonus{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int salary=input.nextInt();
int years=input.nextInt();
double bonus;
if(years>5){
 bonus=salary*(5.0/100);
 System.out.println("bonus:"+bonus);
}
else{
System.out.println("no bonus");
}
}
}