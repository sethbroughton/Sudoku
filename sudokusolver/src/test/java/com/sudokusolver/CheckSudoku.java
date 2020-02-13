package com.sudokusolver;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckSudoku {
	
	@Test
	public void Check_Each_Constraint () {
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
	//Check Column
		Assert.assertFalse(CheckGuess.checker(4, 0, 0, grid));
	//Check Row
		Assert.assertFalse(CheckGuess.checker(5, 0, 0, grid));
	//Check Sector
		Assert.assertFalse(CheckGuess.checker(7, 0, 0, grid));
	}
		

}
