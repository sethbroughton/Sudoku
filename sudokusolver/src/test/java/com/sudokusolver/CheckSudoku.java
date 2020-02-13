package com.sudokusolver;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckSudoku {
	
	@Test
	public void SolveSudokuSolver() {
		int[][] grid = { 
				 { 0, 0, 5, 3, 0, 0, 0, 0, 0 }, 
				 { 0, 0, 0, 0, 0, 0, 0, 2, 0 }, 
				 { 0, 7, 0, 0, 1, 0, 5, 0, 0 }, 
				 { 4, 0, 0, 0, 0, 5, 3, 0, 0 }, 
				 { 0, 1, 0, 0, 7, 0, 0, 0, 6 }, 
				 { 0, 0, 3, 2, 0, 0, 0, 8, 0 }, 
				 { 0, 6, 0, 5, 0, 0, 0, 0, 9 }, 
				 { 0, 0, 4, 0, 0, 0, 0, 3, 0 }, 
				 { 0, 0, 0, 0, 0, 9, 7, 0, 0 }, };
		
	//Puzzle puzzle = new Puzzle(grid);

	//Assert.assertFalse(solveSudoku(grid));
	
	}

}
