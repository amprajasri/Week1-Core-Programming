import java.util.Scanner;
public class TotalProductPrice{
 public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  double price=input.nextFloat();
  int quantity=input.nextInt();
  System.out.println(" The total purchase price is INR "+price+" if the quantity "+quantity+" and unit price is INR "+(price*quantity));
    
 }
}