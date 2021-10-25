package com.blp.tictactoegame;

import java.util.Scanner;

/**
 * Tic Tac Toe Game
 */
public class TicTacToeGame {
    //Declaring and initializing variables
    public static char[] board;
    public static char charter;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        System.out.println(createBoard()); //Call method to create board
        makeChoice(); //Call method to choose charter
        showBoard(); //Call method to show the board
        move(); //Call method to make move
        checkFreeSpace(); //Call method to check free space
        checkFirstMove(); //Call method to check who play first
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
                System.out.print(board[i] + "_" + "|" + "_");
            }
        }
    }

    private static void move() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 9");
        int number = sc.nextInt();
        System.out.println("Player got the location on board = " + number);
        int computerChoice = (int) ((Math.random() * 10) % 10);
        System.out.println("Computer got the location on board = " + computerChoice);
    }

    private static void checkFreeSpace() {
        System.out.println("choose index from 1 to 9  to make the move");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (board[input] == 'x' | board[input] == 'o') {
            System.out.println("Space is not free");

        } else if (board[input] != 'x' | board[input] != 'o') {
            System.out.println("Space is free");
            board[input] = charter;
        }
    }
    private static void checkFirstMove() {
        int head = 0;
        int check = (int) ((Math.random()*10)%2);
        if (check == head){
            System.out.println("Player will play first");
        } else
            System.out.println("Computer will play first");
    }
}



