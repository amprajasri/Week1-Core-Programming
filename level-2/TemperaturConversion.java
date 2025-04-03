import java.util.Scanner;
public class TemperaturConversion{
 public static void main(String[] args){
 Scanner input =new Scanner(System.in);
 double celsius=input.nextDouble();
 double farenheitResult =celsius * (9.0 / 5) + 32;
 System.out.println("The "+farenheitResult+" fahrenheit is "+celsius+" celsius");
 }
}