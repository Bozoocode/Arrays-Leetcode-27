package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static int diagonalArraySum(int[][] matrix) {
        int sumRight = 0;
        int sumLeft = 0;
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Check if the matrix has only one element
        if (numRows == 1 && numCols == 1) {
            return matrix[0][0];
        }

        int midRow = numRows / 2;
        int midCol = numCols / 2;
        int middleNumber = 0;

        // Calculate the sum of the right diagonal
        for (int i = 0; i < numRows; i++) {
            sumRight += matrix[i][i];
        }

        // Calculate the sum of the left diagonal
        for (int j = 0; j < numRows; j++) {
            sumLeft += matrix[j][numCols - j - 1];
        }

        // Subtract the middle number from the total sum
        if (numRows % 2 == 1 && numCols % 2 == 1) {
            middleNumber = matrix[midRow][midCol];
        }

        return sumRight + sumLeft - middleNumber;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1,1},
            {1, 1,1,1 },
            {1, 1,1, 1},
            {1,1,1,1}
        };
        System.out.println("Diagonal Array Sum: " + diagonalArraySum(matrix));
    }
}
