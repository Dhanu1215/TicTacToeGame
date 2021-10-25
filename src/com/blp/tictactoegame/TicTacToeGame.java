package com.blp.tictactoegame;

import java.util.Scanner;

/**
 * Tic Tac Toe Game
 */
public class TicTacToeGame {
    //Declaring and initializing variables
    public static char[] board;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        System.out.println(createBoard()); //Call method to create board
        makeChoice(); //Call method to choose charter
        showBoard(); //Call method to show the board
    }

    private static char[] createBoard() {
        board = new char[10]; //Create array to print board
        for (int i = 1; i <= board.length - 1; i++) {
            board[i] = ' ';
        }
        return (board); //Return the board to that method
    }

    private static void makeChoice() { //Choice charter to play the game
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter charter 'X' or 'O'");
        String charter = sc.next();
    }

    private static void showBoard() {
        for (int i = 1; i <= board.length - 1; i++) {
            if (i == 3 || i == 6) {
                System.out.println(board[i]);
            } else {
                System.out.print(board[i] + "_" + "|" +"_");
            }
        }
    }
}

