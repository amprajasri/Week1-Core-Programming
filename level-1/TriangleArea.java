import java.util.Scanner;
public class TriangleArea{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 double height=input.nextFloat();
   double base=input.nextFloat();
   double area=(1.0/2)*base*height;
  System.out.println("area= "+area);
  
}
}