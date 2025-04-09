import java.util.Scanner;
public class GreatestFactors{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if(n>0){
for(int i=n-1;i>0;i--){
 if(n%i==0){
  System.out.println(i);
  break;
 }
}
} 
}
}