package com.chegg.queen;

public class Queens {
	public static final int BOARD_SIZE = 8;// board size
	public static final int EMPTY = 0;// used to indicate empty square
	public static final int QUEEN = 1;// used to indicate square contain queen

	private int board[][];// chess board

	public Queens() {
		board = new int[BOARD_SIZE][BOARD_SIZE];// create an empty 8X8 board
	}

	// Method to clear the board
	public void clearBoard() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = EMPTY;
			}
		}
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public void displayBoard() {
		//displays the board
		//zero is an empty square and one is queen
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean placeQueens(int column) {
		//places the queens in columns of the board begining at the column specified
		if (column >= BOARD_SIZE) {
			return true;//base case
			
		}
		else {
			boolean queenplaced = false;
			int row = 0;//no of square in column
			while (!queenplaced && row < BOARD_SIZE) {
				//if square can be attacked
				if (isUnderAttack(row, column)) {
					//consider next square in column
					++row;
				} else {
					setQueen(row, column);
					queenplaced = placeQueens(column + 1);
					//if no queen is possible in next column
					if (!queenplaced) {
						//remove queen placed earlier
						//try next square in column
						removeQueen(row, column);
						++row;
					}
				}
			}
			return queenplaced;
		}
	}

	public void setQueen(int row, int column) {
		//sets the queen at square indicated by row and column
		board[row][column] = QUEEN;
	}

	public void removeQueen(int row, int column) {
		//removes the queen at square indicated by row and column and set square to EMPTY  
		board[row][column] = EMPTY;
	}

	public boolean isUnderAttack(int row, int column) {
		//Queens can't be in same row or column.return true if under attack otherwise return false
		for (column = 0; column < BOARD_SIZE; column++) {
			if (board[row][column] == QUEEN) {
				return true;
			}
		}
		column = column - 1;
		row = row - 1;
		while (row >= 0 && column >= 0) {
			if (board[row--][column--] == QUEEN) {
				return true;
			}
		}

		row = row + 1;
		column = column - 1;
		while (row < BOARD_SIZE && column >= 0) {
			if (board[row++][column--] == QUEEN) {
				return true;
			}
		}
		return false;
	}

	private int index(int number) {
		return number - 1;
	}
}
