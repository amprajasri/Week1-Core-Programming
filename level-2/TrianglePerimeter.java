import java.util.Scanner;
import java.lang.Math;
public class TrianglePerimeter{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double s1=input.nextDouble();
double s2=input.nextDouble();
double s3=input.nextDouble();
double kmSum=(s1+s2+s3)/1000;
double totalRounds=Math.ceil(5/kmSum);
System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
}
}