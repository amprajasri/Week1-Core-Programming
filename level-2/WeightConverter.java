import java.util.Scanner;
public class WeightConverter{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 double pounds=input.nextDouble();
 System.out.println(" The weight of the person in pound is "+pounds+" and in kg is "+(pounds/2.2));
}
}