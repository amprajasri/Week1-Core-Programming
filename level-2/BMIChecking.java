import java.util.Scanner;
public class BMIChecking
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double[][] personData=new double[10][3];
		System.out.println("enter weight and height of 10 persons");
		for(int i=0;i<10;i++)
		{
			personData[i][0]=input.nextDouble();
			personData[i][1]=input.nextDouble();
			personData[i][2]=BMICalculation( personData[i][0],personData[i][1]);
		}
			System.out.println("height, weight, BMI, and weight status of each person: ");
		for(int i=0;i<10;i++)
		{
			System.out.println("weight: "+personData[i][0]);
			System.out.println("height: "+personData[i][1]);
			System.out.println("BMI: "+personData[i][2]);
			System.out.println("weight Status: "+getBMIStatus(personData[i][2]));

		}
		
	}
	public static double BMICalculation(double weight,double height )
	{
		return weight/((height/100.0f)*(height/100.0f));
	}
	public static String getBMIStatus(double BMI)
	{
	 String[] remarks={"Underweight","Normal","Overweight","Obese"};
	 
		
			if(BMI<=18.4)
				{
					return remarks[0];
				}
			else if(BMI>18.4 && BMI<25)
				{
					return remarks[1];
				}
			else if(BMI>=25 && BMI<40)
				{
					return remarks[2];
				}
			else
				{
					return remarks[3];
				}
		
	}
}
	
