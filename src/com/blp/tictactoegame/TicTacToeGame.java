package com.blp.tictactoegame;

import java.util.Objects;
import java.util.Scanner;

/**
 * Tic Tac Toe Game
 */
public class TicTacToeGame {
    //Declaring and initializing variables
    public static char[] board;
    public static String char1 = "x";
    public static String char2 = "o";
    public static char userInput;
    public static int input;
    public static int computerChoice;

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
        String userInput = sc.next();
        System.out.println("Player chooses the charter = " + userInput);
        if (userInput.equals(char1)){
            System.out.println("Computer will take input= " + char2);
        }
        else
            System.out.println("Computer will take input = " + char1);
    }

    private static void showBoard() {
        System.out.println(" " + board[1] + "|" + board[2] + "|" + board[3]);
        System.out.println("--+--+--");
        System.out.println(" " + board[4] + "|" + board[5] + "|" + board[6]);
        System.out.println("--+--+--");
        System.out.println(" " + board[7] + "|" + board[8] + "|" + board[9]);
    }

    private static void move() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number between 1 to 9");
        input = sc.nextInt();
        System.out.println("Player got the location on board = " + input);
        computerChoice = (int) ((Math.random() * 10) % 10);
        System.out.println("Computer got the location on board = " + computerChoice);
        if (computerChoice == input) {
            System.out.println("Player will make choice again");
            System.out.println("Enter number between 1 to 9");
            input = sc.nextInt();
        }
    }

    private static void checkFreeSpace() {
        if (board[input] == 'x' || board[input] == 'o') {
            System.out.println("Space is not free");

        } else if (board[input] != 'x' || board[input] != 'o') {
            System.out.println("Space is free");
            board[input] = userInput;
            showBoard();
        }
    }

    private static void checkFirstMove() {
        int head = 0;
        int check = (int) ((Math.random() * 10) % 2);
        System.out.println();
        if (check == head) {
            System.out.println("Player will play first");
        } else
            System.out.println("Computer will play first");
    }
}



