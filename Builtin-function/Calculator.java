import java.util.Scanner;
import java.lang.Math;
public class Calculator
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int first=input.nextInt();
		int second=input.nextInt();
		System.out.println("select one ftom +,*,-,/:");
		String op=input.next();
 switch(op){
 case "+":
    System.out.println("addition:"+add(first,second));
	break;
 case "-":
     System.out.println("Subtraction:"+sub(first,second));
	 break;
 case "*":
      System.out.println("multiplication:"+mul(first,second));
	  break;
 
 case "/":
       System.out.println("division:"+div(first,second));
	   break;
 default:
  System.out.println("Invalid Operator");
 
 }
	    
}

  public static int add(int n1,int n2)
  {
	return n1+n2;
  }
  public static int sub(int n1,int n2)
  {
	return n1-n2;
  }
  public static int div(int n1,int n2)
  {
	return n1/n2;
  }
  public static int mul(int n1,int n2)
  {
	return n1*n2;
  }
}


	

	
	
	
