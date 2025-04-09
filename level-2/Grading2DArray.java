import java.util.Scanner;
public class Grading2DArray

{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		float marks[][]=new float[n][3];
		float percentage[]=new float[n];
		String grades[]=new String[n];
		for(int i=0;i<n;i++)
		{
			marks[i][0]=input.nextFloat();
			marks[i][1]=input.nextFloat();
			marks[i][2]=input.nextFloat();
			percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
		}
		for(int i=0;i<n;i++){
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
		
		for(int i=0;i<n;i++)
		{
			System.out.println("physics marks: "+marks[i][0]);
			System.out.println("chemistry marks: "+marks[i][1]);
			System.out.println("maths marks: "+marks[i][2]);
			System.out.println("percentage: "+percentage[i]+"%");
			System.out.println("grade: "+grades[i]);
		}
	}
}