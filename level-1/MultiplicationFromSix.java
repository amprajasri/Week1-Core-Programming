import java.util.Scanner;
public class MultiplicationFromSix{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int multiplicationResult[]= new int[5];
for (int i=0;i<4;i++){
multiplicationResult[i]=n*(i+6);
}
for (int i=6;i<=9;i++){
System.out.println(n+" x "+i+" = "+multiplicationResult[i-6]);}
}
}