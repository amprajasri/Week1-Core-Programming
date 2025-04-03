import java.util.Scanner;
public class TemperaturConversionFahrenheit{
 public static void main(String[] args){
 Scanner input =new Scanner(System.in);
 double fahrenheit=input.nextDouble();
 double celsiusResult= (fahrenheit-32) * (5.0/9);
 System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
 }
}