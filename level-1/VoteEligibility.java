import java.util.Scanner;
public class VoteEligibility{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
	int students[]=new int[10];
     for(int i=0;i<10;i++){
  students[i]=input.nextInt();
}	
 for(int j=0;j<students.length;j++){
  if(students[j]<0){
   System.out.println("invalid age");
  }
  else if(students[j]<18){
  System.out.println("the student with the age "+students[j]+" can not vote");
  }
  else{
  System.out.println("the student with the age "+students[j]+" can vote");
  }
 }
 
 
  
 



}
}