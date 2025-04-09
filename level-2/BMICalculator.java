import java.util.Scanner;
public class BMICalculator

{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int height[]=new int[n];
		int weight[]=new int[n];
		float BMI[]=new float[n];
		System.out.println("enter height and weight of person:");
		for(int i=0;i<n;i++)
		{
			height[i]=input.nextInt();
			weight[i]=input.nextInt();
			BMI[i]=(float)weight[i]/ ((height[i] / 100.0f) * (height[i] / 100.0f));  //converting cm to meters 100.0f is to ensure floating point
		}
		System.out.println("height, weight, BMI, and weight status of each person: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("height: "+height[i]);
			System.out.println("weight: "+weight[i]);
			System.out.println("BMI: "+BMI[i]);
			if(BMI[i]<=18.4)
				{
					System.out.println("Underweight");
				}
			else if(BMI[i]>18.4 && BMI[i]<25)
				{
					System.out.println("Normal");
				}
			else if(BMI[i]>=25 && BMI[i]<40)
				{
					System.out.println("Overweight");
				}
			else
				{
					System.out.println("Obese");
				}
			
		}

	}
}