package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String player = "X";

        String[][] board = new String[3][3];

        boardSetUp(board);

        playGame(scanner, player, board);
    }

    private static void printBoard(String[][] board) {
        System.out.println("---------");
        System.out.println("| " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " |");
        System.out.println("| " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " |");
        System.out.println("| " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " |");
        System.out.println("---------");
    }

    private static String checkWinner(String[][] board) {

        Boolean found = false;
        String line = null;

        for (int a = 0; a < 8; a++) {

            switch (a) {
                case 0:
                    line = board[0][0] + board[0][1] + board[0][2];
                    break;
                case 1:
                    line = board[1][0] + board[1][1] + board[1][2];
                    break;
                case 2:
                    line = board[2][0] + board[2][1] + board[2][2];
                    break;
                case 3:
                    line = board[0][0] + board[1][0] + board[2][0];
                    break;
                case 4:
                    line = board[0][1] + board[1][1] + board[2][1];
                    break;
                case 5:
                    line = board[0][2] + board[1][2] + board[2][2];
                    break;
                case 6:
                    line = board[0][0] + board[1][1] + board[2][2];
                    break;
                case 7:
                    line = board[0][2] + board[1][1] + board[2][0];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        out:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    found = true;
                    break out;
                }
            }
        }

        if (found) {
            return "null";
        } else {
            return "draw";
        }
    }

    private static void boardSetUp(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    private static void playGame(Scanner scanner, String player, String[][] board) {
        int[] play = new int[2];
        int accepted = 0;
        String result;

        first:
        while (true) {

            printBoard(board);

            do {
                System.out.println("Enter the coordinates:");

                if (!scanner.hasNextInt()) {

                    System.out.println("You should enter numbers!");
                    scanner.nextLine();

                } else {

                    for (int i = 0; i < 2; i++) {
                        play[i] = scanner.nextInt();
                    }

                    if (!(play[0] >= 1 && play[0] <= 3 && play[1] >= 1 && play[1] <= 3)) {

                        System.out.println("Coordinates should be from 1 to 3!");

                    } else {

                        if (!(board[play[0] - 1][play[1] - 1].equals(" "))) {

                            System.out.println("This cell is occupied! Choose another one!");

                        } else {

                            board[play[0] - 1][play[1] - 1] = player;
                            accepted = 1;

                            if (player.equals("X")) {
                                player = "O";
                            } else {
                                player = "X";
                            }
                        }
                    }
                }
            } while (accepted != 1);

            result = checkWinner(board);

            switch (result) {
                case "X":
                    printBoard(board);
                    System.out.println("X wins");
                    break first;

                case "O":
                    printBoard(board);
                    System.out.println("O wins");
                    break first;

                case "draw":
                    printBoard(board);
                    System.out.println("Draw");
                    break first;

                case "null":
                    break ;
            }
        }
    }
}
