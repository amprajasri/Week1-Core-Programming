import java.util.Scanner;
public class UserInputDiscountFee{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int fees=input.nextInt();
	float discount=input.nextFloat();
	float discountamt=fees*((float)discount/100);
    float finalfee=fees-discountamt;
	System.out.println("The discount amount is INR "+discountamt+" and final discounted fee is INR "+finalfee);
	
}
}