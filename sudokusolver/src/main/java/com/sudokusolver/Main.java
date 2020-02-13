package com.sudokusolver;

public class Main {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		int[][] grid = puzzle.getGrid();

		if (Solver.solveSudoku(grid)) {
			display(grid);
			System.out.print(Solver.backtracks);
		} else {
			System.out.print("Program timed out");
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

}
