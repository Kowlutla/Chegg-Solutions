package com.chegg.queen;

public class QueensTest {

	public static void main(String[] args) {
		
		Queens board1=new Queens();
		for(int row=0;row<Queens.BOARD_SIZE;row++)
		{
			board1.clearBoard();
			board1.setQueen(row, 1);
			if(board1.placeQueens(1))
			{
				board1.displayBoard();
			}
			else
			{
				System.out.println("No solution found");
			}
			System.out.println();
		}
	}
}
