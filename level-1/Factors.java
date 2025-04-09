import java.util.Scanner;
public class Factors{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int maxFactor=10;
int factors[]=new int[maxFactor];
int index=0;
for(int i=1;i<=n;i++){
if(n%i==0){ 
factors[index]=i;
index++;
}
if(index==maxFactor){
maxFactor*=2;
int temp[]=new int[maxFactor]; //creating a new temp array with double size
System.arraycopy(factors,0,temp,0,index); //built in function that is used to copy one array in to other
factors=temp; //the factor reference will to assigned to temp array just like variable assignment

}

}
for(int i=0;i<index;i++){
System.out.println(factors[i]+" ");}

}
}