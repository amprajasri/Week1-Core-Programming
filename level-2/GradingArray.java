import java.util.Scanner;
public class GradingArray{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
float physics[]=new float[n];
float chemistry[]=new float[n];
float maths[]=new float[n];
float percentage[]=new float[n];
String grades[]=new String[n];
float tempPhy,tempChe,tempMat;
int i=0;
		while(i<n)
		{
			tempPhy=input.nextFloat();
			tempChe=input.nextFloat();
			tempMat=input.nextFloat();
			if(tempPhy<0 || tempChe<0 || tempMat<0) System.out.println("incorrect marks, re-enter all 3 subject marks");
			else
			{
				physics[i]=tempPhy;
				chemistry[i]=tempChe;
				maths[i]=tempMat;
				percentage[i]=(physics[i]+chemistry[i]+maths[i])/3;
				i++;
				
			}
		}
        for(i=0;i<n;i++){
			if(percentage[i]>=80){
					grades[i]="A" ;
				}
			else if(percentage[i]>=70){
				grades[i]="B";
				}
				else if (percentage[i]>=60){
					grades[i]="C";
				}
				else if(percentage[i]>=50){
					grades[i]="D";
					}
				else if(percentage[i]>=40){
				grades[i]="E";
					}
				else{
				grades[i]="R";
				}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println("physics marks: "+physics[i]);
			System.out.println("chemistry marks: "+chemistry[i]);
			System.out.println("maths marks: "+maths[i]);
			System.out.println("percentage: "+percentage[i]+"%");
			System.out.println("grade: "+grades[i]);
		}
}
}