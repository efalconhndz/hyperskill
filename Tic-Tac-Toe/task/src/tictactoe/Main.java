package tictactoe;
import java.util.Scanner;  // Import the Scanner class

public class Main {

    private static void printBoard(char[][] board) {

        System.out.println("---------");
        System.out.println("| " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " |");
        System.out.println("| " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " |");
        System.out.println("| " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " |");
        System.out.println("---------");

    }

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        char player = 'X';

        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter Cells: ");
        String userInput = scanner.nextLine();  // Read user input
        char[] userInputChars = userInput.toCharArray();
        int position = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if ( userInputChars[position] == '_') {
                    userInputChars[position] = ' ';
                }

                board[i][j] = userInputChars[position];
                position++;
            }
        }

        printBoard(board);

//        char winner = '\0';
//        int row = 0;
//
//        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
//            winner = board[0][0];
//            row = row + 1;
//        }
//        if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
//            winner = board[1][0];
//            row = row + 1;
//        }
//        if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
//            winner = board[2][0];
//            row = row + 1;
//        }
//        if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
//            winner = board[0][0];
//            row = row + 1;
//        }
//        if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
//            winner = board[0][1];
//            row = row + 1;
//        }
//        if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
//            winner = board[0][2];
//            row = row + 1;
//        }
//        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
//            winner = board[0][0];
//            row = row + 1;
//        }
//        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
//            winner = board[0][2];
//            row = row + 1;
//        }
//
//        int countX = 0;
//        int countO = 0;
//
//        for (int x = 0; x < 3; x++) {
//            for (int y = 0; y < 3; y++) {
//
//                if ( board[x][y] == 'X' ) {
//                    countX++;
//                } else if ( board[x][y] == 'O') {
//                    countO++;
//                }
//            }
//        }

//        int number = 0;
//
//        do {
            System.out.println("Enter the coordinates: ");
            int row = 0;
            int col = 0;
            if (scanner.hasNextInt()) {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } else {
                System.out.println("You should enter numbers!");
            }

            if (board[row][col] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            }

        printBoard(board);


//            while (!scanner.hasNextInt()) {
//                System.out.println("You should enter numbers!");
//                scanner.next(); // this is important!
//            }

//            for (int i = 0; i < 2; i++) {
//                nums[i] = scanner.nextInt();
//            }
//        } while (number < 0 && number > 9);




//        if (row >= 2 || (countX - countO) >= 2L || (countO - countX) >= 2L) {
//            System.out.println("Impossible");
//        } else if (row == 0 && new String(userInputChars).contains("_")) {
//            System.out.println("Game not finished");
//        } else if (row == 0 || row == 2) {
//            System.out.println("Draw");
//        } else {
//            System.out.println(winner + " wins");
//        }
    }
}
