package com.blp.tictactoegame;

/**
 * Tic Tac Toe Game
 */
public class TicTacToeGame {

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard(); //Call method to create board
    }

    private static char[] createBoard() {
        char[] board = new char[10]; //Create array to print board
        for (int i = 1; i <= board.length - 1; i++) {
            board[i] = ' ';
        }
        return (board); //Return the board to that method
    }
}
