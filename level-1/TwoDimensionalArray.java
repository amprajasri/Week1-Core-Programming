import java.util.Scanner;
public class TwoDimensionalArray{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int r=input.nextInt();
int c=input.nextInt();

int twodArray[][]=new int[r][c];

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
 twodArray[i][j]=input.nextInt();
}
}
int onedArray[]=new int[r*c];
int onedIndex=0;
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
 onedArray[onedIndex]=twodArray[i][j];
 onedIndex++;
}}
System.out.println("1d array:");
for(int i=0;i<r*c;i++){
System.out.print(onedArray[i]+" ");}

}
}