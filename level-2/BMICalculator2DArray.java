import java.util.Scanner;
public class BMICalculator2DArray

{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		double[][] personDate=new double[n][3];
		String[] weightStatus=new String[n];
		String[] remarks={"Underweight","Normal","Overweight","Obese"};
		System.out.println("enter height and weight of person:");
		for(int i=0;i<n;i++)
		{
			personDate[i][0]=input.nextDouble();
			personDate[i][1]=input.nextDouble();
			personDate[i][2]=personDate[i][1]/((personDate[i][0]/100.0f)*(personDate[i][0]/100.0f));
		}
		for(int i=0;i<n;i++)
		{
			if(personDate[i][2]<=18.4)
				{
					weightStatus[i]=remarks[0];
				}
			else if(personDate[i][2]>18.4 && personDate[i][2]<25)
				{
					weightStatus[i]=remarks[1];
				}
			else if(personDate[i][2]>=25 && personDate[i][2]<40)
				{
					weightStatus[i]=remarks[2];
				}
			else
				{
					weightStatus[i]=remarks[3];
				}
		}
			
		System.out.println("height, weight, BMI, and weight status of each person: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("height: "+personDate[i][0]);
			System.out.println("weight: "+personDate[i][1]);
			System.out.println("BMI: "+personDate[i][2]);
			System.out.println("weight Status: "+weightStatus[i]);

		}
	}
}