package com.sudokusolver;

public class CheckGuess {

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

		return true; // passes all tests
	}
}
