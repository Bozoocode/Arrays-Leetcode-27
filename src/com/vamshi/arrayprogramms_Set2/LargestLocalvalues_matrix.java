package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class LargestLocalvalues_matrix {
	public static int[][] largestLocal(int[][] grid) {
	    int numRows = grid.length;
	    int numCols = grid[0].length;
	    int[][] maxLocal = new int[numRows - 2][numCols - 2];

	    for (int i = 0; i < numRows - 2; i++) {
	        for (int j = 0; j < numCols - 2; j++) {
	            int largestValue = Integer.MIN_VALUE;

	            for (int r = i; r <= i + 2; r++) {
	                for (int c = j; c <= j + 2; c++) {
	                    largestValue = Math.max(largestValue, grid[r][c]);
	                }
	            }

	            maxLocal[i][j] = largestValue;
	        }
	    }

	    return maxLocal;
	}

	public static void main(String[] args) {
	    int[][] grid = {
	        {1, 1, 1, 1,1},
	        {1, 1, 1, 1,1},
	        {1, 1, 2, 1,1},
	        {1, 1, 1, 1,1},{1,1,1,1,1}
	    };

	    int[][] result = largestLocal(grid);
	    System.out.println(Arrays.deepToString(result));
	}

}
