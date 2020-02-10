package com.sudokusolver;

public class Main {
static int backtracks = 0; //Sets global counter for number of recursive backtracks to solve puzzle

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		int[][] grid = puzzle.getGrid();
		if (solveSudoku(grid)) {
			display(grid);
			System.out.print(backtracks);
		} else {
			//System.out.print("Program timed out");
		}
	}

	// Prints out 2D Sudoku array
	public static void display(int[][] grid) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" " + grid[i][j]);
			}
			System.out.println();
		}
	}

//Recursive Backtracking function	
	public static boolean solveSudoku(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				if (grid[row][col] == 0) {
					for (int n = 1; n <= 9; n++) {
						if (checker(n, row, col, grid)) {
							grid[row][col] = n;
							if (solveSudoku(grid)) { // Recursive Call
								return true;
							} else {
								grid[row][col] = 0; // BackTracking
								backtracks++;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	// Verifies the number does not violate any Sudoku constraints
	// Returns True if input number passes
	public static boolean checker(int number, int row, int col, int[][] grid) {
		// Check Row
		int i = row;
		for (int j = 0; j < grid.length; j++) {
			if (grid[i][j] == number) {
				return false;
			}
		}
		// Check Column
		i = col;
		for (int j = 0; j < grid.length; j++) {
			if (grid[j][i] == number) {
				return false;
			}
		}
		// Check Sector
		int r = row - row % 3;
		int c = col - col % 3;
		for (int y = r; y < (r + 3); y++) {
			for (int j = c; j < (c + 3); j++) {
				if (grid[y][j] == number) {
					return false;
				}
			}
		}

		return true; //passes all tests
	}

}
