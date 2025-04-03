public class FindingDiscountFee{
public static void main(String[] args){
	int fees=125000;
	int discount=10;
	float discountamt=fees*((float)10/100);
    float finalfee=fees-discountamt;
	System.out.println("The discount amount is INR "+discountamt+" and final discounted fee is INR "+finalfee);
	
}
}