package com.sudokusolver;

public class Solver {
	static int backtracks = 0; // Sets global counter for number of recursive backtracks to solve puzzle

	// Recursive Backtracking function
	public static boolean solveSudoku(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				if (grid[row][col] == 0) {
					for (int n = 1; n <= 9; n++) {
						if (CheckGuess.checker(n, row, col, grid)) {
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

}
