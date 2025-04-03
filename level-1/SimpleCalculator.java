import java.util.Scanner;
public class SimpleCalculator6{
 public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  float num1=input.nextFloat();
  float num2=input.nextFloat();
  System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+ (num1+num2)+" , " +(num1-num2)+" , "+(num1*num2)+" and "+(num1/num2));
  
 }
}