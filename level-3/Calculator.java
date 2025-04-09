import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 double first=input.nextDouble();
 double second=input.nextDouble();
 String op=input.next();
 switch(op){
 case "+":
    System.out.println("addition:"+(first+second));
	break;
 case "-":
     System.out.println("Subtraction:"+(first-second));
	 break;
 case "*":
      System.out.println("multiplication:"+(first*second));
	  break;
 
 case "/":
       System.out.println("division:"+(first/second));
	   break;
 default:
  System.out.println("Invalid Operator");
 
 }



}
}