package com.blp.tictactoegame;

/**
 * Tic Tac Toe Game
 */
public class TicTacToeGame {
    //Declaring and initializing variables
    public static final int X = 1;
    public static final int O = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard(); //Call method to create board
        makeChoice(); //Call method to choose charter
    }

    private static char[] createBoard() {
        char[] board = new char[10]; //Create array to print board
        for (int i = 1; i <= board.length - 1; i++) {
            board[i] = ' ';
        }
        return (board); //Return the board to that method
    }

    private static void makeChoice() { //Choice charter to play the game
        int choice = (int) ((Math.random() * 10) % 2); //Use random method to choice char
        switch (choice) {
            case X:
                System.out.println("Player1 got the 'X' charter choice");
                break;
            case O:
                System.out.println("Computer got the 'O' charter choice");
                break;
        }
    }
}
