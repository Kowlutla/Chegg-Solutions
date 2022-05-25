package matricOperations;

public class MathematicalMatrixOperations {
	//1.Method to compute the sum of two matrices
	public int[][]sumOfTwoArrays(int array1[][],int array2[][])
	{
		int result[][]=new int[array1.length][array1[0].length];//matrix to store the sum of matrices
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				result[i][j]=array1[i][j]+array2[i][j];
			}
		}
		return result;
	}
	//2.Method to scalar multiplication of matrix
	public void scalarMultiplication(int matrix[][],int scalar)
	{
		System.out.println("Scalar Multiplication of matrix with "+scalar);
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{	//Multiplying matrix element with scalar and printing
				System.out.print(matrix[i][j]*scalar+"\t");
			}
			System.out.println("\n");
		}
	}
	//3.Method to transpose of matrix
	public void transposeOfMatrix(int matrix[][])
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		int [][]transpose=new int[cols][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println("Transpose of Matrix: ");//printing the transposed matrix
		for(int i=0;i<transpose.length;i++)
		{
			for(int j=0;j<transpose[i].length;j++)
			{
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	//4.Method to multiply two matrices
	public void matrixMultiplication(int matrix1[][],int matrix2[][])
	{
		int leftrows=matrix1.length;//no of rows in left matrix
		int leftcols=matrix1[0].length;//no of columns in left matrix
		int rightrows=matrix2.length;//no of rows in right matrix
		int rightcols=matrix2[0].length;//no of columns in right matrix
		
		if(leftcols!=rightrows)
		{
			System.out.println("Multiplication not possible");
			return;
		}
		else
		{
			System.out.println("Matrix multiplication: ");
			int product[][]=new int[leftrows][rightcols];
			for(int i=0;i<leftrows;i++)
			{
				for(int j=0;j<rightcols;j++)
				{
					for(int k=0;k<leftcols;k++)
					{
						product[i][j]=product[i][j]+matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			for(int i=0;i<leftrows;i++)
			{
				for(int j=0;j<rightcols;j++)
				{
					System.out.print(product[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
	}
	
	//5.Method to print the sub matrix
	public void subMatrix(int matrix[][],int remove_row,int remove_col)
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		//if given positions are not in range to remove
		if(remove_row>rows && remove_col>cols)
		{
			System.out.println("Positions are not in matrix range: ");
			System.out.println("Resulted Sub matrix: ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print(matrix[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
		//if remove_row is not in matrix range and remove_col in matrix range then remove remove_col 
		else if(remove_row>rows && remove_col<=cols)
		{
			System.out.println("SubMatrix: ");
			for(int i=0;i<rows;i++)
			{
				for(int j=0,k=0;j<cols;j++)
				{
					if(j==cols-1)
					{
						continue;
					}
					else
					{
						System.out.print(matrix[i][j]+"\t");
					}
				}
				System.out.println("\n");
			}
			
			
		}
		
		else if(remove_col>cols && remove_row<=rows)
		{
//			int subMatrix[][]=new int[rows-1][cols];
			System.out.println("SubMatrix: ");
			for(int i=0;i<rows;i++)
			{
				if(i==remove_row-1)
				{
					continue;
				}
				else
				{	
					for(int j=0;j<cols;j++)
					{
						System.out.print(matrix[i][j]+"\t");
					}
					System.out.println("\n");
				}
			}
		}
		
		else 
		{
			System.out.println("SubGraph: ");
			for(int i=0;i<rows;i++)
			{
				if(i==remove_row-1)
					continue;
				for(int j=0;j<cols;j++)
				{
					if(j==remove_col-1)
						continue;
					else
					{
						System.out.print(matrix[i][j]+"\t");
					}
				}
				System.out.println("\n");
			}
		}
	}
	
	//6.Method to perform Square Matrix operations
	public void SquareMatrixOprations(int matrix[][])
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		if(rows!=cols)
		{
			System.out.println("Matrix is not Square Matrix. So square matrix operations not possible");
			return;
		}
		System.out.println("Diagonal Matrix: ");
		int diagonalMatrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i==j)
				{
					diagonalMatrix[i][j]=matrix[i][j];
				}
				else
				{
					diagonalMatrix[i][j]=0;
				}
			}
		}
		//printing diagonal matrix
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(diagonalMatrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("Lower triangular Matrix: ");
		int lowerTriangular[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i>=j)
				{
					lowerTriangular[i][j]=matrix[i][j];
				}
				else
				{
					lowerTriangular[i][j]=0;
				}
			}
		}
		//printing lower triangular matrix
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(lowerTriangular[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("Upper triangular Matrix: ");
		int upperTriangular[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i<=j)
				{
					 upperTriangular[i][j]=matrix[i][j];
				}
				else
				{
					 upperTriangular[i][j]=0;
				}
			}
		}
		//printing lower triangular matrix
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print( upperTriangular[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	//7.Method to find the determinant of matrix
	public double determinent(int [][]matrix)
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		if(rows!=cols)//if matrix is not 
		{
			System.out.println("Matrix is not Square matrix..determinent not possible ");
			return Integer.MIN_VALUE;
		}
		else
		{
			return determinentUtil(matrix,rows);
		}
	}
	//7.Utility method to find determinant of matrix
	public double determinentUtil(int matrix[][],int m)
    {
        int c[][]=new int[m][m];
        int i,j,k;
        double sum=0;
        if(m==1) { sum=matrix[0][0];  }
        else if(m==2)
        {
            sum=(( matrix[0][0]*matrix[1][1] ) - ( matrix[0][1]*matrix[1][0] ));
        }
        else
        {
            for(int p=0;p<m;p++)
            {
              int h=0;k=0;
              for(i=1;i<m;i++)
              {
                for(j=0;j<m;j++)
                    {
                     if(j==p)
                     continue;
                     c[h][k]=matrix[i][j];
                     k++;
                     if(k==m-1)
                      {
                         h++;
                         k=0;
                      }  }
              }
            sum=sum+matrix[0][p]*Math.pow((-1),p)*determinentUtil(c,m-1);
            }
        }
        return sum;
    }	
}
