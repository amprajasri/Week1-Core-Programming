import java.util.Scanner;
public class CheckingAbundantNumber{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 int sum=0;
 for(int i=1;i<n;i++){
  if(n%i==0) sum+=i;
 }
 
if(sum>n)System.out.println("is Abundant Number");
else System.out.println("is not Abundant Number");

}
}