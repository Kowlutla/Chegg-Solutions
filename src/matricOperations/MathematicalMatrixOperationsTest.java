package matricOperations;

public class MathematicalMatrixOperationsTest {

	public static void main(String[] args) {
		
		MathematicalMatrixOperations operations=new MathematicalMatrixOperations();
		int matrix1[][]= {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}
						 };
		
		int matrix2[][]= {{16,15,14,13},
						  {12,11,10,9},
						  {8,7,6,5},
						  {4,3,2,1}
				 		};
		
		System.out.println("Matrix1: ");
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[0].length;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nMatrix2: ");
		for(int i=0;i<matrix2.length;i++)
		{
			for(int j=0;j<matrix2[0].length;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println("\n");
		}
		//1.sum of matrix1 and matrix2
		int sum[][]=operations.sumOfTwoArrays(matrix1, matrix2);
		System.out.println("Sum of Two Matrices: ");
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		//2.Scalar multiplication of matrix 1
		operations.scalarMultiplication(matrix1, 3);
		
		//3.Transpose of matrix1
		operations.transposeOfMatrix(matrix1);
		
		//4.Multiplication of matrix1 and matrix2
		operations.matrixMultiplication(matrix1, matrix2);
		
		//5.SubMatrix after removing second row third column
		operations.subMatrix(matrix1, 2, 3);
		//6.Square Matrix operations
		System.out.println("Matrix1 Square Operations: ");
		operations.SquareMatrixOprations(matrix1);
		
		//7.Determinant of matrix1
		System.out.println("Determinant of matrix1: "+operations.determinent(matrix1));
				
	}

}

