import java.util.Scanner;
public class BonusCalculations{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 double salaries[]=new double[10];
 double service[] = new double[10];
 double totalBonus=0.0,totalOldSalary=0.0,totalNewSalary=0.0;
 double newSalries[]=new double[10];
 double bonus[]=new double[10];
 int i=0;
 double temp=0.0;
  System.out.println("enter salaries");
 while(i<10){
  temp=input.nextDouble();
  
  if(temp<0) 
  {System.out.println("invalid salary,enter again");
   }
    else{
  salaries[i]=temp;
  i++;
 }
 }
 i=0;
  System.out.println("enter service years");
 while(i<10)
 {
  temp=input.nextDouble();
  if(temp<0) 
  {System.out.println("invalid service years,enter again");
   }
   else{
  service[i]=temp;
  i++;
 }
 
}

for(i=0;i<10;i++){
 if(service[i]>5){
   bonus[i]=salaries[i]*(5.0/100);
   
 }
 else{
	 bonus[i]=salaries[i]*(2.0/100);
 }
 newSalries[i]=salaries[i]+bonus[i];
}

for(i=0;i<10;i++){
 totalNewSalary+=newSalries[i];
 totalOldSalary+=salaries[i];
 totalBonus+=bonus[i];
}
System.out.println("total bonus:"+totalBonus);
System.out.println("total old salary:"+totalOldSalary);
System.out.println("total new salary:"+totalNewSalary);
 
}
}