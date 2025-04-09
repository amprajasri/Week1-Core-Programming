import java.util.Scanner;
public class AverageHeight{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
double heights[] = new double[11];
double sum=0.0;
for(int i=0;i<11;i++){
 heights[i]=input.nextDouble();
}
for(int i=0;i<11;i++){
  sum+=heights[i];
}
System.out.println("average height:"+(sum/11));
}
}