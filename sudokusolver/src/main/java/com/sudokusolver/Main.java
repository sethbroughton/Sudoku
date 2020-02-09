package com.sudokusolver;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		int[][] grid = puzzle.getGrid();
		if (solveSudoku(grid)) {
			display(grid);
		}
		else {
			System.out.print("Cannot be solved");
		}
	}

//System print

	public static void display(int[][] grid) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" " + grid[i][j]);
			}
			System.out.println();
		}
	}

//Backtracking function	
	public static boolean solveSudoku(int[][] grid) {
		// grab first empty cell (cell = 0);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				if (grid[row][col] == 0) {
					for (int n = 1; n <= 9; n++) {
						if (checker(n, row, col, grid)) {
							grid[row][col] = n;
							if (solveSudoku(grid)) {
								return true;
							}
							else {
								grid[row][col] = 0;
							}
						}
						}
					return false;
					}
	
				}
			}
		return true;
	}

//Methods
	public static boolean checker(int number, int row, int col, int[][] grid) {
		// Check Row
		Set<Integer> rows = new HashSet<Integer>();
		int i = row;
		for (int j = 0; j < grid.length; j++) {
			rows.add(grid[i][j]);
		}
		if (!rows.add(number)) {
			return false;
		}
		// Check Column
		Set<Integer> cols = new HashSet<Integer>();
		i = col;
		for (int j = 0; j < grid.length; j++) {
			cols.add(grid[j][i]);
		}
		if (!cols.add(number)) {
			return false;
		}
		// Check Sector
		Set<Integer> sector = new HashSet<Integer>();
		int r = row - row % 3;
		int c = col - col % 3;
		for (int y = r; y < (r + 3); y++) {
			for (int j = c; j < (c + 3); j++) {
				sector.add(grid[y][j]);
			}
		}
		if (!sector.add(number)) {
			return false;
		}
		return true;
	}
	
}

