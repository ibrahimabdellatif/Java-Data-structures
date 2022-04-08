package com.company.ibrahim;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
//        define 2D array directly, this is way like top definition
        char[][] boardTwo = new char[][]{
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
        };

        //to print 2D array use deepToString, but with one d array use toString
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
