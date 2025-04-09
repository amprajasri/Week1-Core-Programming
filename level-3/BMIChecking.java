import java.util.Scanner;
public class BMIChecking
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double[][] personData=new double[10][2];
		System.out.println("enter weight and height of 10 persons");
		for(int i=0;i<10;i++)
		{
			personData[i][0]=input.nextDouble();
			personData[i][1]=input.nextDouble();
			
		}
		String BMIStatus[][]=getBMIStatus(personData);
		display(BMIStatus);
		
	}
	public static String[][] getBMIStatus(double personData[][] )
	{
		String info[][]=new String[10][4];
		String[] remarks={"Underweight","Normal","Overweight","Obese"};
	 
		for(int i=0;i<personData.length;i++)
		{
		  info[i][0]=String.valueOf(personData[i][0]);
		  info[i][1]=String.valueOf(personData[i][1]);
		  double BMI=personData[i][0]/((personData[i][1]/100.0f)*(personData[i][1]/100.0f));
		  info[i][2]=String.format("%.2f",BMI);
		  if(BMI<=18.4)
				{
					info[i][3]=remarks[0];
				}
			else if(BMI>18.4 && BMI<25)
				{
					info[i][3]=remarks[1];
				}
			else if(BMI>=25 && BMI<40)
				{
					info[i][3]=remarks[2];
				}
			else
				{
					info[i][3]=remarks[3];
				}
		
	   }
	   return info;
	}
	
	public static void display(String info[][])
	{
		System.out.println("weight\theigth\tBMI\tStatus");
		for(int i=0;i<info.length;i++)
		{
			System.out.println("--------------------------------");
			System.out.println(info[i][0]+"\t"+info[i][1]+"\t"+info[i][2]+"\t"+info[i][3]);
		}
	}
	
}
	
