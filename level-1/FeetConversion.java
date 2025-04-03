import java.util.Scanner;
public class FeetConversion{
 public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  double feet=input.nextFloat();
  double cm=feet*30.48;
  double inches=feet*12;
  System.out.println(feet+" feet in inches "+inches+" and in cm is "+cm);
  
 }
}