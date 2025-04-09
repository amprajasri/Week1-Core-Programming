import java.util.Scanner;
public class Grading{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
float physics=input.nextFloat();
float chemistry=input.nextFloat();
float maths=input.nextFloat();
float totalMarks=physics+chemistry+maths;
float percentage=(totalMarks/300)*100;
System.out.println("average marks:"+percentage);
if(percentage>=80){
System.out.println("A Grade-above agency-normalized standards");
}
else if(percentage>=70){
System.out.println("B Grade-at agency-normalized standards");
}
else if (percentage>=60){
System.out.println("C Grade-below, but approaching agency-normalized standards");
}
else if(percentage>=50){
System.out.println("D Grade-well below agency-normalized standards");
}
else if(percentage>=40){
System.out.println("E Grade-too below agency-normalized standards");
}
else{
System.out.println("R Grade-Remedial standards");
}
}
}