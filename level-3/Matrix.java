import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Matrix
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int r1=input.nextInt();
		int c1=input.nextInt();
		int r2=input.nextInt();
		int c2=input.nextInt();
		int mat1[][]=getMatrix(r1,c1);
		int mat2[][]=getMatrix(r2,c2);
		System.out.println("matrix1:");
		display(mat1);
		System.out.println("matrix2:");
		display(mat2);
		int sum[][]=addition(mat1,mat2);
		if(sum.length==0) System.out.println("not possible to add due to different dimensions of mat1 and mat2");
		else 
		{
			System.out.println("sum of mat1 and mat2:");
			display(sum);
		}
		int sub[][]=subtraction(mat1,mat2);
		if(sum.length==0) System.out.println("not possible to subtract due to different dimensions of mat1 and mat2");
		else 
		{
			System.out.println("subtraction of mat1 and mat2:");
			display(sub);
		}
		int mul[][]=multiplication(mat1,mat2);
		if(mul.length==0) System.out.println("not possible to multiply due to different dimensions of mat1 and mat2");
		else 
		{
			System.out.println("multiplication of mat1 and mat2:");
			display(mul);
		}
		System.out.println("transpose of matrix1:");
		int trans[][]=transpose(mat1);
		display(trans);
		boolean isDeterminant=checkDeterminant(mat1);
		if (isDeterminant)
		{
			int det=determinant(mat1);
			System.out.println("determinant of matrix 1: "+det);
		}
		else
		{
			System.out.println("determinant can not be calulated as it is not square matrix");
		}

		double inverse[][];
		if(isDeterminant)
		{
		inverse=inverseMatrix(mat1);
		System.out.println("inverse of matrix 1:");
		for(int i=0;i<inverse.length;i++)
			{
				for(int j=0;j<inverse[0].length;j++)
				{
					System.out.print(inverse[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("inverse can not be calulated as it is not square matrix");
		}
		
	}
	public static int[][] getMatrix(int r,int c)
	{
		int matrix[][]=new int[r][c];
		Random rand=new Random();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=rand.nextInt(100)+1;
			}
		}
		return matrix;
	}
	public static void display(int matrix[][])
	{ 
	   for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[0].length;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		  
	}
	public static int[][] addition(int mat1[][],int mat2[][])
	{
		if(mat1.length==mat2.length && mat1[0].length==mat2[0].length)
		{
			int sum[][]=new int[mat1.length][mat1[0].length];
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0;j<mat1[0].length;j++)
				{
					sum[i][j]=mat1[i][j]+mat2[i][j];				}
				
			}
			return sum;
		}
		return new int[0][0];
	}
	public static int[][] subtraction(int mat1[][],int mat2[][])
	{
		if(mat1.length==mat2.length && mat1[0].length==mat2[0].length)
		{
			int sum[][]=new int[mat1.length][mat1[0].length];
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0;j<mat1[0].length;j++)
				{
					sum[i][j]=mat1[i][j]-mat2[i][j];				}
				
			}
			return sum;
		}
		return new int[0][0];
	}
	
	public static int[][] multiplication(int mat1[][] , int mat2[][])
	{
		if(mat1[0].length==mat2.length)
		{
		int result[][]=new int[mat1.length][mat2[0].length];
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[0].length;j++)
			{int temp=0;
				for(int k=0;k<mat1[0].length;k++)
				{
					temp+=mat1[i][k]*mat2[k][j];
				}
				result[i][j]=temp;	
			}
		}
		return result;
		}
		return new int[0][0];
	}
	public static int[][] transpose(int mat[][])
	{
		int temp[][]=new int[mat[0].length][mat.length];
		for(int i=0;i<mat[0].length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				if(i==j) temp[i][j]=mat[i][j];
				else temp[i][j]=mat[j][i];
					
			}
			
		}
		return temp;
	}
	public static int determinant(int mat[][])
	{
	
		if(mat.length==1) return mat[0][0];
		int d=0;
		int sign=1;
		
		for(int i=0;i<mat.length;i++)
		{
			int temp[][]=coFactor(mat,0,i);
			d+=sign*mat[0][i]*determinant(temp);
			sign*=-1;
		}
		return d;
	}
	
	public static int[][] coFactor(int mat[][],int p,int q)
	{
		int i=0,j=0;
		int temp[][]=new int[mat.length-1][mat.length-1];
		for(int row=0;row<mat.length;row++)
		{
			for(int col=0;col<mat.length;col++)
			{
				if(row!=p && col!=q)
				{
					temp[i][j]=mat[row][col];
					j++;
					if(j==mat.length-1)
					{
						j=0;
						i++;
					}
				}
			}
		}
		return temp;
	}
	
	public static double[][] inverseMatrix(int mat[][])
	{
		int d=determinant(mat);
		int cofactorMatrix[][]=new int[mat.length][mat.length];
		int temp[][]=new int[mat.length-1][mat.length-1];
		int val;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				temp=coFactor(mat,i,j);
				val=determinant(temp);
				cofactorMatrix[i][j]=val*(int)Math.pow(-1,i+j);
				
			}
		}
		
		int adjMatrix[][]=transpose(cofactorMatrix);
		double inverse[][]=new double[mat.length][mat.length] ;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				inverse[i][j]=(1.0/d)*adjMatrix[i][j];
			}
		}
		return inverse;
	}
	
	public static boolean checkDeterminant(int mat[][])
	{
		return (mat.length==mat[0].length);
	}
	
  
	
	
}