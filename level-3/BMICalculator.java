import java.util.Scanner;
public class BMICalculator{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 double weight=input.nextDouble();
 double height_cm=input.nextDouble();
 double height=height_cm/100;
 double BMI=weight/(height*height);
 if(BMI<=18.4)
 {
 System.out.println("Underweight");
 }
 else if(BMI>18.4 && BMI<25)
 {
 System.out.println("Normal");
 }
 else if(BMI>=25 && BMI<40)
 {
 System.out.println("Overweight");
}
else
{
System.out.println("Obese");
}
}
}