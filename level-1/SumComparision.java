import java.util.Scanner;
public class SumComparision{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if (n<0){
 System.out.println("not a natural number");
 
}
else{
int sum1=0;
int i=1;
while(i<=n){
sum1+=i;
i++;
}
int sum2=n*(n+1)/2;

if (sum1==sum2){
System.out.println(sum1);
}
}
}
}