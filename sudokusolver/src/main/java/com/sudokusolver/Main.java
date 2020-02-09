package com.sudokusolver;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		int[][] grid = puzzle.getGrid();
		boolean value = isSolved(grid);
		System.out.print(value);
	}

//Methods
	public static boolean isSolved(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			Set<Integer> nums = new HashSet<Integer>();
			for (int j = 0; j < grid.length; j++) {
				if (!nums.add(grid[i][j])) {
					return false;
				}
			}
		}

		for (int i = 0; i < grid.length; i++) {
			Set<Integer> nums = new HashSet<Integer>();
			for (int j = 0; j < grid.length; j++) {
				if (!nums.add(grid[j][i])) {
					return false;
				}
			}
		}

		for(int n = 0; n<9; n=n+3) {
			Set<Integer> nums = new HashSet<Integer>();
			for (int i = n; i<(3+n); i++) {
			for (int j = n; j<(3+n); j++) {
				if (!nums.add(grid[i][j])) {
					System.out.print(i + " " + j);
				return false;
				}
			}
		}
		}
		
		return true;
	}

}
